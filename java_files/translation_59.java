import java.util.*;

public class Translation59 {
    public void unsetSection(String section, String subsection) {
    ConfigSnapshot src;
    ConfigSnapshot res;
    do {
        src = snapshot.get();
        res = unsetSection(src, section, subsection);
    }
    while (!snapshot.compareAndSet(src, res));
}
}