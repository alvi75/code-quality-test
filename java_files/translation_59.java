import java.util.*;

public class Translationtranslation_59 {
    public void unsetSection(String section, String subsection) {
        ConfigSnapshot src = state.get();
        ConfigSnapshot res = null;
        try {
            res = unsetSection(src, section, subsection);
            state.set(res);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}