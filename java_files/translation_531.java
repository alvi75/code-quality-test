import java.util.*;

public class Translation531 {
    public void setNoChildReport() {
    for (PerfTask task : tasks) {
        if (task instanceof TaskSequence) {
            ((TaskSequence)task).setNoChildReport();
        }
    }
}
}
}