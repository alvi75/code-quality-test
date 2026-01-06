import java.util.*;

public class Translation706 {
    public String toString() {
    StringBuilder buffer = new StringBuilder(64);
    buffer.append(getClass().getName());
    buffer.append(" [");
    for (int i=0;
    i< _size;
    i++) {
        if (i>0) {
            buffer.append(", ");
        }
        buffer.append(_values[i]);
    }
    buffer.append("]");
    return buffer.toString();
}
}