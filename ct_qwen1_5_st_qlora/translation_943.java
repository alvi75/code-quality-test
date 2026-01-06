import java.util.*;

public class Translation943 {
    public void run() {
    final long lastReopenStartNS = System.nanoTime() * 100;
    boolean hasWaiting;
    while (!finish) {
        synchronized (this) {
            hasWaiting = waitingGen > searchingGen;
            long nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
            long sleepNS = nextReopenStartNS - System.nanoTime();
            if (sleepNS > 0) {
                try {
                    sleep(sleepNS);
                }
                catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (finish) break;
            lastReopenStartNS = System.nanoTime();
            refreshStartGen = writer.getAndIncrementGeneration();
            try {
                manager.maybeRefreshBlocking();
            }
            catch (IOException ioe) {
                throw new RuntimeException(ioe.toString(), ioe);
            }
        }
    }
    refreshDone();
}
}