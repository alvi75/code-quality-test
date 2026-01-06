import java.util.*;

public class Translation44 {
    public String toString() {
    final StringBuilder buffer = new StringBuilder();
    final int length = getLength();
    buffer.append(getPath().getDirectorySeparatorChar());
    for(int i=0;
    i<length;
    i++) {
        buffer.append(getComponent(i));
        if(i<(length-1)) {
            buffer.append(getPath().getDirectorySeparatorChar());
        }
    }
    return buffer.toString();
}
}