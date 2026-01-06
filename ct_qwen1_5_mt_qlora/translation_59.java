import java.util.*;

public class Translation59 {
    public void unsetSection(String section, String subsection) {
    ConfigSnapshot src;
    ConfigSnapshot res;
    do {
        src = state.get();
        res = unsetSection(src, section, subsection);
    }
    while (!state.compareAndSet(src, res));
}
}