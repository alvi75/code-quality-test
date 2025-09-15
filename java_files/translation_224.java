import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_224 {
    public static String toStringTree(final Tree t) {
        final List<String> names = new ArrayList<String>();
        getUniqueNames(t, names);
        final StringBuilder buf = new StringBuilder();
        buf.append("Tree [");
        for (String name : names) {
            if (name != null) {
                buf.append(name);
            }
            else {
                buf.append("(null)");
            }
            buf.append(" -> ");
        }
        buf.append(t.getName());
        if (t.getLeaf() != null) {
            buf.append(" -> ").append(t.getLeaf().getName());
        }
        buf.append("]");
        return buf.toString();
    }
}