import java.util.*;

public class Translation403 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[MMS]\n");
    sb.append(" .addMenu = ").append(Integer.toHexString(getAddMenuCount())).append("\n");
    sb.append(" .delMenu = ").append(Integer.toHexString(getDelMenuCount())).append("\n");
    sb.append("[/MMS]\n");
    return sb.toString();
}
}