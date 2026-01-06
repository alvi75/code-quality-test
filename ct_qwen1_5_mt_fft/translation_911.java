import java.util.*;

public class Translation911 {
    public String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.append(getClass().getName()).append(" [");
    sb.append("sid=").append(HexDump.shortToHex(_sid));
    sb.append(" size=").append(_data.length);
    sb.append(" : ").append(HexDump.toHex(_data)).append("\n");
    return sb.toString();
}
}