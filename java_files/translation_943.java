import java.util.*;

public class Translation943 {
    public void run() {
    final long startMS = System.currentTimeMillis();
    while(!stopNow) {
        final long msLeft = (pauseMS-startMS);
        if (msLeft <= 0) {
            unpaused();
        }
        else {
            try {
                Thread.sleep(msLeft);
            }
            catch (InterruptedException ie) {
                unpaused();
            }
        }
    }
}
}