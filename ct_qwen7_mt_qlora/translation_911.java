import java.util.*;

public class Translation911 {
    1 public String toString() {
    2 StringBuffer buffer = new StringBuffer();
    3 buffer.append(getClass().getName()).append("[");
    4 buffer.append(" sid=").append(HexDump.shortToHex(getSid()));
    5 buffer.append(" size=").append(data.length);
    6 buffer.append(" data=").append(HexDump.toHex(data));
    7 buffer.append("]");
    8 return buffer.toString();
}
}