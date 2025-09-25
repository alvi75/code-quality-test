import java.util.*;

public class Translation943 {
    public void run() {
    long lastReopenStartNS = System.nanoTime();
    while (!finish) {
        boolean hasWaiting;
        synchronized (this) {
            hasWaiting = waitingGen > searchingGen;
        }
        long nextReopenStartNS = lastReopenStartNS+ (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
        long sleepNS = nextReopenStartNS - System.nanoTime();
        if (sleepNS > 0) {
            try {
                reopenCond.await(sleepNS / Time.NANOSECONDS_PER_MILLISECOND, TimeUnit.MILLISECONDS);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
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