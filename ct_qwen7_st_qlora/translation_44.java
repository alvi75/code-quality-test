import java.util.*;

public class Translation44 {
    public String toString() {
    final StringBuilder builder = new StringBuilder();
    final int length = length();
    builder.append(File.separatorChar);
    for(int i=0;
    i<length;
    i++) {
        builder.append(getComponent(i));
        if (i < (length-1)) {
            builder.append(File.separatorChar);
        }
    }
    return builder.toString();
}
}