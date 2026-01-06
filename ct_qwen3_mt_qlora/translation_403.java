import java.util.*;

public class Translation403 {
    1 public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[MMS]\n");
    buffer.append(" .addMenu = ").append(Integer.toHexString(getAddMenuCount())).append("\n");
    buffer.append(" .delMenu = ").append(Integer.toHexString(getDelMenuCount())).append("\n");
    buffer.append("[/MMS]\n");
    return buffer.toString();
}
}