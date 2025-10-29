import java.util.*;

public class Translation531 {
    01 public void setNoChildReport() {
    this.noChildReport = true;
    for (PerfTask task : this.tasks) {
        if (task instanceof TaskSequence) {
            ((TaskSequence)task).setNoChildReport();
        }
    }
}
}