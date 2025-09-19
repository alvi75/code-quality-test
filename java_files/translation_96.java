import java.util.*;

public class Translation96 {
    public String toString() {
    String token, buffer = new StringBuilder();
    if (startIndex >= 0 && startIndex <= endIndex) {
        buffer.append("token start=" + startIndex+ " end=" + endIndex);
        buffer.append(" text='" + getText() + "'");
    }
    buffer.append(" type=" + type);
    buffer.append(" channel=" + channel);
    buffer.append(" start=" + start);
    buffer.append(" stop=" + stop);
    buffer.append(" step=" + step);
    return buffer.toString();
}
}