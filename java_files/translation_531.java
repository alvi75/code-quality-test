import java.util.*;

public class Translation531 {
    public void setNoChildReport() {
    setChildReport(false);
    for (PerfTask task : tasks) {
        if (task instanceof TaskSequence) {
            ((TaskSequence) task).setNoChildReport();
        }
    }
}
}