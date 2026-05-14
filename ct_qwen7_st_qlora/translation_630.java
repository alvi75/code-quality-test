import java.util.*;

public class Translation630 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[BACKUP]\n");
    sb.append(" .backup = ").append(Integer.toHexString(getBackup())).append("\n");
    sb.append("[/BACKUP]\n");
    return sb.toString();
}
}