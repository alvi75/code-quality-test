import java.util.*;

public class Translation59 {
    public void unsetSection(String section, String subsection) {
    ConfigSnapshot src = state.get();
    ConfigSnapshot res = unsetSection(src, section, subsection);
    state.compareAndSet(src, res);
}
}