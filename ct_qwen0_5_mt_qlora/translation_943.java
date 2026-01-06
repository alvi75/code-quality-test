import java.util.*;

public class Translation943 {
    public void run() {
    long lastReopenStartNS = System.nanoTime()*100L;
    boolean hasWaiting = false;
    while (!finish) {
        boolean hasWaiting2 = false;
        synchronized(this) {
            hasWaiting = waitingGen > searchingGen;
            hasWaiting2 = waitingGen > finishedGen;
            waitingGen = searchingGen;
            searchingGen = finishedGen;
            finishedGen = 0;
        }
        if (hasWaiting || hasWaiting2) {
            try {
                manager.refreshBlocking();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            finally {
                refreshStartGen = writer.getAndIncrementGeneration();
            }
        }
        refreshDone();
    }
}