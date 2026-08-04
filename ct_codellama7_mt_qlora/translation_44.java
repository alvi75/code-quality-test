import java.util.*;

public class Translation44 {
    public String toString() {
    StringBuilder builder = new StringBuilder();
    int length = this.length;
    builder.append(Path.directorySeparatorChar);
    for (int i = 0;
    i < length;
    i++) {
        builder.append(this.getComponent(i));
        if (i < (length - 1)) {
            builder.append(Path.directorySeparatorChar);
        }
    }
    return builder.toString();
}
}