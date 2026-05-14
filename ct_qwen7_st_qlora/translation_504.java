import java.util.*;

public class Translation504 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FtCbls ]\n");
    buffer.append(" size = ").append(getRecordSize()).append("\n");
    buffer.append(" reserved = ").append(HexDump.toHex(_reserved)).append("\n");
    buffer.append("[/FtCbls ]\n");
    return buffer.toString();
}
}