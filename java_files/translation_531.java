import java.util.*;

public class Translation531 {
    ublic void setNoChildReport() {
    letChildReport = false;
    for (PerfTask task : tasks) {
        if (task instanceof TaskSequence) {
            ((TaskSequence) task).setNoChildReport();
        }
    }
}
}