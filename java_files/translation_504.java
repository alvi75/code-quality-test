import java.util.*;

public class Translationtranslation_504 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[FtCbls ]\n");
        buffer.append(" size = ").append(getDataSize()).append("\n");
        buffer.append(" flags = ").append(HexDump.toHex(_flags)).append("\n");
        buffer.append(" reserved = ").append(HexDump.toHex(_reserved)).append("\n");
        buffer.append("[/FtCbls ]\n");
        return buffer.toString();
    }
}