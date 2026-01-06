import java.util.*;

public class Translation59 {
    public final void unsetSection(String section, String subsection) {
    final ConfigSnapshot src;
    final ConfigSnapshot res;
    do {
        src = state.get();
        res = unsetSection(src, section, subsection);
    }
    while (!state.compareAndSet(src, res));
}
}