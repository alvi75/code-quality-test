import java.util.*;

public class Translation979 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[BLANK]\n");
    sb.append(" .row = ").append(Integer.toHexString(getRow())).append("\n");
    sb.append(" .column = ").append(Integer.toHexString(getColumn())).append("\n");
    sb.append(" .xfindex = ").append(Integer.toHexString(getXFIndex())).append("\n");
    sb.append("[/BLANK]\n");
    return sb.toString();
}
}