import java.util.*;

public class Translation943 {
    public void run() {
    long lastReopenStartNS = System.nanoTime();
    while (!finish) {
        boolean hasWaiting;
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            hasWaiting = waitingGen > searchingGen;
        }
        finally {
            lock.unlock();
        }
        long nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
        long sleepNS = nextReopenStartNS - System.nanoTime();
        if (sleepNS > 0) {
            reopenCond.awaitNanos(sleepNS);
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