import java.util.*;

public class Translationtranslation_59 {
    public void unsetSection(String section, String subsection) {
        final ConfigSnapshot src = getState();
        if (src.hasSections()) {
            config.unsetSection(section);
        }
    }
}