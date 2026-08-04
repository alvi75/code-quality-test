import java.util.*;

public class Translation821 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SCENARIOPROTECT]\n");
    buffer.append(" .protect = ").append(Integer.toHexString(getProtect())).append("\n");
    buffer.append("[/SCENARIOPROTECT]\n");
    return buffer.toString();
}
}