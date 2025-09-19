import java.util.*;

public class Translation59 {
    ublic void unsetSection(String section, String subsection) {
    final ConfigSnapshot src;
    final ConfigSnapshot res;
    do {
        src = state.get();
        final Map<String, ConfigSection> sections = src.sections;
        if (sections == null) {
            continue;
        }
        final String secId = toSectionId(section, subsection);
        res = new ConfigSnapshot(src);
        res.sections = new HashMap<>(sections.size());
        for (Map.Entry<String, ConfigSection> e : sections.entrySet()) {
            if (e.getKey().equals(secId)) {
                continue;
            }
            res.sections.put(e.getKey(), e.getValue());
        }
    }
    while (!state.compareAndSet(src, res));
}
}