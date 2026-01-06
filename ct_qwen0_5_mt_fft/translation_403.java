import java.util.*;

public class Translation403 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[MMS]\n");
    buffer.append(" .addMenu = ").append(HexDump.shortToHex(getAddMenuCount())).append("\n");
    buffer.append(" .delMenu = ").append(HexDump.shortToHex(getDelMenuCount())).append("\n");
    buffer.append("[/MMS]\n");
    return buffer.toString();
}
}