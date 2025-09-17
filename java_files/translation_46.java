import java.util.*;

public class Translationtranslation_46 {
    public void setProgressMonitor(ProgressMonitor pm) {
        if (pm == null) {
            monitor = NullProgressMonitor.INSTANCE;
        }
        else {
            monitor = pm;
        }
    }
}