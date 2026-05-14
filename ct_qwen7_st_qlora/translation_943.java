import java.util.*;

public class Translation943 {
    public void run() {
    long lastReopenStartNS = System.nanoTime();
    while(!finish) {
        boolean hasWaiting;
        synchronized(this) {
            hasWaiting = waitingGen > searchingGen;
        }
        final long nextReopenStartNS;
        if (hasWaiting) {
            nextReopenStartNS = lastReopenStartNS+targetMinStaleNS;
        }
        else {
            nextReopenStartNS = lastReopenStartNS+targetMaxStaleNS;
        }
        final long sleepNS = nextReopenStartNS-System.nanoTime();
        if (sleepNS>0) {
            try {
                reopenCnd.awaitNanos(sleepNS);
            }
            catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (finish) {
            break;
        }
        lastReopenStartNS = System.nanoTime();
        refreshStartGen = writer.getAndIncrementGeneration();
        try {
            writer.refresh();
        }
        catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }
}
refreshDone();
}
}