import java.util.*;

public class Translation44 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    int length = getLength();
    buffer.append(getPath().getSeparator()).append(getPath().getName(0));
    for (int i = 1;
    i < length;
    i++) {
        buffer.append(getPathComponent(i));
    }
    return buffer.toString();
}
}