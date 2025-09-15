import java.util.*;

public class Translationtranslation_821 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[SCENARIOPROTECT]\n");
        buffer.append(" .scenarioProtectType = ").append(Integer.toHexString(getScenarioProtectType())).append("\n");
        buffer.append(" .protect = ").append(isProtect()).append("\n");
        buffer.append("[/SCENARIOPROTECT]\n");
        return buffer.toString();
    }
}