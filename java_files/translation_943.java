import java.util.*;

public class Translation943 {
    public void run() {
    final long startMS = System.currentTimeMillis();
    while (!stop) {
        final long msLeft = (pauseMS - (System.currentTimeMillis() - startMS));
        if (msLeft > 0) {
            synchronized (lock) {
                wait(msLeft);
            }
        }
        else {
            doTask();
        }
    }
}
}