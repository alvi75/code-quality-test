import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_59 {
    public void unsetSection(String section, String subsection) {
        final ConfigSnapshot src;
        final ConfigSnapshot res;
        do {
            src = state.get();
            final Map<String, ConfigSection> sections = src.sections;
            if (sections != null) {
                ConfigSection s = sections.get(section);
                if (s != null) {
                    ConfigSection.Subsection subsec = s.subsections.get(subsection);
                    if (subsec != null) {
                        res = removeSubsection(s, subsec);
                    }
                }
                else {
                    res = new ConfigSnapshot(src);
                }
            }
        }
        while (!state.compareAndSet(src, res));
    }
}