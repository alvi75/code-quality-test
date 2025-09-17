import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_422 {
    public final List<String> getFooterLines(String keyName) {
        final List<FooterLine> src = getFooterLines();
        if (src.isEmpty())return Collections.emptyList();
        final ArrayList<String> r = new ArrayList<>(src.size());
        for (FooterLine f : src) {
            if (f.matches(keyName))r.add(f.getValue());
        }
        return r;
    }
}