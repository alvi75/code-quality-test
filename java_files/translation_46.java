import java.util.*;

public class Translation46 {
    ublic void setProgressMonitor(ProgressMonitor pm) {
    if (pm == null) {
        pm = NullProgressMonitor.INSTANCE;
    }
    progressMonitor = pm;
}
}