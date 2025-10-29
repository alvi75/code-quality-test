import java.util.*;

public class Translation943 {
    0;
else {
    nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
}
long sleepNS = nextReopenStartNS - System.nanoTime();
if (sleepNS > 0) {
    // #if !NETSTANDARD1_6try {
        // #endif reopenCond.await(sleepNS / Time.MILLISECONDS_PER_NANOSECOND);
        // #if !NETSTANDARD1_6}
        catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            return;
        }
        //#endif if (finish) {
            break;
        }
        lastReopenStartNS = System.nanoTime();
        refreshStartGen = writer.getAndIncrementGeneration();
        try {
            manager.maybeRefreshBlocking();
        }
        catch (IOException ioe) {
            throw new Exception(ioe.toString(), ioe);
        }
    }
    refreshDone();
}
}