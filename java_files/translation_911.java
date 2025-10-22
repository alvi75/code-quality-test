import java.util.*;

public class Translation911 {
    public String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.append(getClass().getName()).append(" [");
    sb.append("sid=").append(HexDump.shortToHex(sid));
    sb.append(" size=").append(data.length);
    sb.append(" : ").append(HexDump.toHex(data));
    sb.append("]\n");
    return sb.toString();
}
}