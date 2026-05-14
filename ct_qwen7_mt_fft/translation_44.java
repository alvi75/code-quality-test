import java.util.*;

public class Translation44 {
    public String toString() {
    final StringBuilder builder = new StringBuilder();
    final int length = this.length();
    builder.append(File.pathSeparatorChar);
    for(int i=0;
    i<length;
    i++) {
        builder.append(getComponent(i));
        if (i<(length-1)) {
            builder.append(File.pathSeparatorChar);
        }
    }
    return builder.toString();
}
}