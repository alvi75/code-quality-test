import java.util.*;

public class Translation943 {
    public void run() {
    final long lastReopenStartNS = System.nanoTime();
    while (!finish) {
        boolean hasWaiting;
        synchronized (this) {
            hasWaiting = waitingGen > searchingGen;
        }
        final long nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
        final long sleepNS = nextReopenStartNS - System.nanoTime();
        if (sleepNS > 0) {
            System.out.println("Sleeping for " + sleepNS + " ns");
        }
        else {
            System.out.println("Sleeping forever");
        }
        try {
            this.wait(1);
        }
        catch (final InterruptedException ie) {
            System.err.println("Interrupted while sleeping");
        }
        finally {
            System.out.println("Exiting sleep loop");
        }
    }
}