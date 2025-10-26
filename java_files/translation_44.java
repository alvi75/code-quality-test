import java.util.*;

public class Translation44 {
    public String toString() {
    StringBuilder builder = new StringBuilder();
    int length = this.length();
    builder.append(File.separator);
    for (int i = 0;
    i < length;
    i++) {
        builder.append(getComponent(i));
        if (i < (length - 1)) {
            builder.append(File.separator);
        }
    }
    return builder.toString();
}
}