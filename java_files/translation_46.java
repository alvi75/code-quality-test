import java.util.*;

public class Translationtranslation_46 {
    public void setProgressMonitor(ProgressMonitor pm) {
        if (pm == null) {
            pm = NullProgressMonitor.INSTANCE;
        }
        monitor = new Semaphore(0);
        monitor.setPriority(Thread.currentThread().getPriority());
        this.pm = pm;
    }
}