import java.util.*;

public class Translationtranslation_630 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[BACKUP]\n");
        buffer.append(" .backup = ").append(Integer.toHexString(getBackup())).append("\n");
        buffer.append("[/BACKUP]\n");
        return buffer.toString();
    }
}