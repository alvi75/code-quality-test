import java.util.*;

public class Translation46 {
    public void setProgressMonitor(ProgressMonitor pm) {
    if (pm == null) {
        pm = NullProgressMonitor.INSTANCE;
    }
    this.pm = pm;
}
}