import java.util.*;

public class Translation44 {
    public String toString() {
    final StringBuilder b = new StringBuilder();
    final int length = path.length();
    b.append(path.charAt(0));
    for(int i=1;
    i<length;
    i++) {
        b.append(separatorChar);
        b.append(path.charAt(i));
    }
    return b.toString();
}
}