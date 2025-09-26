import java.util.*;

public class Translation911 {
    1 public String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.append(getClass().getName()).append(" [");
    sb.append("sid=").append(Integer.toHexString(sid));
    sb.append(" size=").append(data.length);
    sb.append(" : ");
    sb.append(HexDump.toHex(data));
    sb.append("]\n");
    return sb.toString();
}
}