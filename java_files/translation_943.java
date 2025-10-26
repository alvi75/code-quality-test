import java.util.*;

public class Translation943 {
    public synchronized void run() {
    final long lastReopenStartNS = System.nanoTime() * 100L;
    while (!finish) {
        boolean hasWaiting;
        lock (this) {
            hasWaiting = waitingGen > searchingGen;
        }
        final long nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
        final long sleepNS = nextReopenStartNS - System.nanoTime();
        if (sleepNS > 0) {
            try {
                reopenCond . wait ( TimeUnit . NANOSECONDS . convert ( sleepNS , TimeUnit . NANOSECONDS ) ) ;
            }
            catch ( InterruptedException e ) {
                Thread . currentThread ( ) . interrupt ( ) ;
                return ;
            }
        }
        if ( finish ) break ;
        lastReopenStartNS = System.nanoTime ( ) ;
        refreshStartGen = writer . getAndIncrementGeneration ( ) ;
        try {
            manager . maybeRefreshBlocking ( ) ;
        }
        catch ( IOException e ) {
            throw new RuntimeException ( e . toString ( ) , e ) ;
        }
    }
    refreshDone ( ) ;
}
}