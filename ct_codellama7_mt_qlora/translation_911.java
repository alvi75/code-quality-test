import java.util.*;

public class Translation911 {
    public String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.append(getClass().getName()).append(" [");
    sb.append("sid=").append(HexDump.shortToHex(getSid()));
    sb.append(" size=").append(getRecordSize());
    sb.append(" : ");
    sb.append(HexDump.toHex(getData()));
    sb.append("]\n");
    return sb.toString();
}
}