import java.util.*;

public class Translation59 {
    public void unsetSection(String section, String subsection) {
    ConfigSnapshot src = state.get();
    ConfigSnapshot res = null;
    HashMap<String, ConfigSnapshot> snapshots = state.getSnapshots();
    synchronized (snapshots) {
        res = snapshots.remove(section);
        if (res == null) {
            return;
        }
        state.set(res);
    }
}
}