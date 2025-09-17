import java.util.*;

public class Translationtranslation_993 {
    public String toString() {
        final StringBuilder s = new StringBuilder();
        s.append(Constants.typeString(getType()));
        s.append(' ');
        s.append(name());
        s.append(' ');
        appendCoreFlags(s);
        return s.toString();
    }
}