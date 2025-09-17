import java.util.*;

public class Translationtranslation_943 {
    public void run() {
        final long start = System.nanoTime();
        while(!finish) {
            boolean hasWaiting = false;
            synchronized (this) {
                if (!waitingGen.isEmpty()) {
                    hasWaiting = true;
                }
            }
            if (hasWaiting) {
                try {
                    reopenCond.signal();
                }
                catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        final long wait = System.nanoTime() - start;
        if (wait < targetWait) {
            try {
                reopenLock.lock();
                waitingGen.addAndGet(1);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            finally {
                reopenLock.unlock();
            }
            waitUntil(long wait) ;
        }
        else {
            try {
                reopenLock.lock();
                waitingGen.addAndGet(1);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            finally {
                reopenLock.unlock();
            }
        }
    }
}