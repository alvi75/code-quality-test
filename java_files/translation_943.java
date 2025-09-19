import java.util.*;

public class Translation943 {
    public synchronized void run() {
    final long start = System.nanoTime();
    while(!finish) {
        boolean hasWaiting = !waitingGen.isEmpty();
        long next = start + (hasWaiting ? minPause : maxPause);
        while(System.nanoTime() < next) {
            try {
                reopenCond.signal();
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        start = next;
        gen++;
        waitingGen.addAndGet(gen);
    }
    try {
        reopenCond.signal();
    }
    catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
    while(waitingGen.size() != 0) {
        try {
            reopenCond.signal();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
}