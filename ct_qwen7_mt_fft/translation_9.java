import java.util.*;

public class Translation9 {
    public SubmoduleAddCommand setProgressMonitor(ProgressMonitor monitor) {
    if (monitor == null) {
        monitor = NullProgressMonitor.INSTANCE;
    }
    this.monitor = monitor;
    return this;
}
}