import java.util.*;

public class Translation821 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SCENARIOPROTECT]\n");
    buffer.append(" .protect = ").append(getProtect()).append("\n");
    buffer.append("[/SCENARIOPROTECT]\n");
    return buffer.toString();
}
}