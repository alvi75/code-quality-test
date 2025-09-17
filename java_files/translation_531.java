import java.util.*;

public class Translationtranslation_531 {
    public void setNoChildReport() {
        letChildReport = false;
        for (final PerfTask task : tasks) {
            if (task instanceof TaskSequence) {
                ((TaskSequence)task).setNoChildReport();
            }
        }
    }
}