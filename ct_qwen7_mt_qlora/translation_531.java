import java.util.*;

public class Translation531 {
    1 public final void setNoChildReport() {
    2 letChildReport = false;
    3 for (final PerfTask task : tasks) {
        4 if (task instanceof TaskSequence) {
            5 ((TaskSequence) task).setNoChildReport();
            6 }
            7 }
        }
}