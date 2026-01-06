import java.util.*;

public class Translation44 {
    public String toString() {
    final StringBuilder buffer = new StringBuilder();
    buffer.append(getPath().getDirectory()).append(File.separator);
    for(int i=0;
    i<length();
    i++) {
        buffer.append(getComponent(i).getPath());
        if (i<(length()-1))buffer.append(File.separator);
    }
    return buffer.toString();
}
}