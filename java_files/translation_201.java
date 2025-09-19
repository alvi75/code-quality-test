import java.util.*;

public class Translation201 {
    public RebaseCommand setProgressMonitor(ProgressMonitor monitor) {
    if (monitor == null) {
        monitor = NullProgressMonitor.INSTANCE;
    }
    this.monitor = monitor;
    return this;
}
}