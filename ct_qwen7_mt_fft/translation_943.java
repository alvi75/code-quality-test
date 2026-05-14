import java.util.*;

public class Translation943 {
    public void run() {
    long lastReopenStartNS = System.nanoTime();
    while(!stopNow) {
        boolean hasWaiting;
        if (searchingGen == refreshGen) {
            hasWaiting = false;
        }
        else if (waitingGen == refreshGen+1) {
            hasWaiting = true;
        }
        else {
            throw new RuntimeException("expected waitingGen==refreshGen+1 but instead found waitingGen=" + waitingGen + " vs refreshGen=" + refreshGen);
        }
        if (hasWaiting) {
            try {
                wait(5000L);
            }
            catch (InterruptedException e) {
                stopNow = true;
                break;
            }
        }
        else {
            long now = System.nanoTime();
            if (now >= lastReopenStartNS + targetMaxStaleNS) {
                lastReopenStartNS = now;
                refreshStartGen = manager.getSearcher().getIndexReader().generation;
                try {
                    manager.maybeRefresh(false);
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        refreshDone();
    }
}