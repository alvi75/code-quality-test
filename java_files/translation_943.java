import java.util.*;

public class Translationtranslation_943 {
    public void run() {
        final long lastReopenStartNS = System.nanoTime()/100;
        while (!isFinished()) {
            boolean hasWaiting = false;
            final long waitForMsec = Math.max(0, REOPEN_INTERVAL_MSEC - (System.nanoTime()/100));
            try {
                wait(waitForMsec);
            }
            catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                return;
            }
            finally {
                if (hasWaiting) {
                    reopenCond.signal();
                }
            }
            final long now = System.nanoTime()/100;
            if ((now - lastReopenStartNS) > REOPEN_INTERVAL_MSEC)) {
                logger.log(DEBUG, "warning: too fast reopen after "+(now-lastReOpenStartNS)+"ms instead of "+REOPEN_INTERVAL_MSEC+"ms");
            }
            lastReopenStartNS = now;
            refreshStartGen = writer.getAndIncrementGeneration();
            try {
                manager.refresh();
            }
            catch (IOException ioe) {
                throw new RuntimeException(ioe);
            }
            refreshDone();
        }
}