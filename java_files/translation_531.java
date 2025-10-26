import java.util.*;

public class Translation531 {
    ublic void setNoChildReport() {
    letChildReport = false;
    for (int i = 0;
    i < tasks.size();
    i++) {
        TaskSequence task = (TaskSequence)tasks.get(i);
        if (task instanceof TaskSequence) {
            ((TaskSequence)task).setNoChildReport();
        }
    }
}
}