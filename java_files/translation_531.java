import java.util.*;

public class Translation531 {
    public void setNoChildReport(boolean b) {
    letChildReport = b;
    for (PerfTask task : tasks) if (task instanceof TaskSequence) ((TaskSequence)task).setNoChildReport(b);
}
}