import java.util.*;

public class Translationtranslation_531 {
    public void setNoChildReport(boolean noChildReport) {
        this.noChildReport = noChildReport;
        for (PerfTask task : tasks) {
            if (task instanceof TaskSequence) {
                ((TaskSequence) task).setNoChildReport(noChildReport);
            }
        }
    }
}