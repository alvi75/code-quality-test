import java.util.*;

public class Translationtranslation_201 {
    public RebaseCommand setProgressMonitor(ProgressMonitor monitor) {
        if (monitor == null) {
            monitor = NullProgressMonitor.INSTANCE;
        }
        this.monitor = monitor;
        return this;
    }
}