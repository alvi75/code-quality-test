import java.util.*;

public class Translation943 {
    public synchronized void run() {
    final long lastReopenStartNS = System.nanoTime() * 100;
    while (!finish) {
        boolean hasWaiting;
        synchronized (this) {
            hasWaiting = waitingGen > searchingGen;
        }
        final long nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
        final long sleepNS = nextReopenStartNS - System.nanoTime();
        if (sleepNS > 0) {
            try {
                reopenCond.await(TimeUnit.NANOSECONDS, sleepNS);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (finish) {
            break ;
        }
        lastReopenStartNS = System.nanoTime();
        refreshStartGen = writer.getAndIncrementGeneration ();
        try {
            manager.maybeRefreshBlocking ( ) ;
        }
        catch (IOException ioe) {
            throw new RuntimeException (ioe . toString ( ) , ioe ) ;
        }
    }
    refreshDone ( ) ;
}
}