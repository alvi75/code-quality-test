import java.util.*;

public class Translation59 {
    1 public synchronized void unsetSection(String section, String subsection) {
    2 ConfigSnapshot src;
    3 ConfigSnapshot res;
    4 do {
        5 src = state.get();
        6 res = unsetSection(src, section, subsection);
        7 }
        while (!state.compareAndSet(src, res));
    }
}