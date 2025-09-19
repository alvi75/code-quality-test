import java.util.*;

public class Translation821 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SCENARIOPROTECT]\n");
    buffer.append(" .options = ").append(HexDump.shortToHex(_options)).append("\n");
    buffer.append("[/SCENARIOPROTECT]\n");
    return buffer.toString();
}
}