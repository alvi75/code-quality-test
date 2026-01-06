import java.util.*;

public class Translation943 {
    public void run() {
    final long lastReopenStartNS = System.nanoTime();
    while (!finish) {
        boolean hasWaiting;
        synchronized(this) {
            hasWaiting = waitingGen > searchingGen;
        }
        final long nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
        final long sleepNS = nextReopenStartNS - System.nanoTime();
        if (sleepNS > 0) {
            reopenCond.awaitNanos(sleepNS);
        }
        if (finish) {
            break;
        }
        lastReopenStartNS = System.nanoTime();
        refreshStartGen = writer.getAndIncrementGeneration();
        try {
            manager.maybeRefreshBlocking();
        }
        catch (IOException ioe) {
            throw new RuntimeException(ioe.toString(), ioe);
        }
    }
    refreshDone();
}
}