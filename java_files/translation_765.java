import java.util.*;

public class Translation765 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("/").append(getFirstPathElement());
    for (int i = 1;
    i < getPathElements().length();
    i++) {
        String value = getPattern(i).getValue();
        buffer.append("/\"").append(value).append("\"");
    }
    return buffer.toString();
}
}