import java.util.*;

public class Translation504 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FtCbls ]\n");
    buffer.append(" size = ").append(length).append("\n");
    buffer.append(" flags = ").append(HexDump.toHex(flags)).append("\n");
    buffer.append("[/FtCbls ]\n");
    return buffer.toString();
}
}