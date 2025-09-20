import java.util.*;

public class Translation943 {
    public void run() throws InterruptedException {
    long lastReopenStartNS = System.nanoTime();
    while (!finish) {
        boolean hasWaiting;
        synchronized (this) {
            hasWaiting = waitingGen > searchingGen;
            long nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
            long sleepNS = nextReopenStartNS - System.nanoTime();
            if (sleepNS > 0) {
                waitOne(sleepNS / 1000000);
            }
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
            throw new RuntimeException(ioe);
        }
    }
    refreshDone();
}
}