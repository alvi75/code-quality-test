import java.util.*;

public class Translationtranslation_44 {
    public String toString() {
        final StringBuilder b = new StringBuilder();
        final int length = path.length();
        b.append(path.getDirectorySeparatorChar());
        for(int i=0;
        i<length;
        i++) {
            b.append(getComponent(i));
            if (i != length-1) {
                b.append(path.getDirectorySeparatorChar());
            }
        }
        return b.toString();
    }
}