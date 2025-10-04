import java.util.*;

public class Translation403 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[MMS]\n");
    buffer.append(" .num = ").append(getNum()).append('\n');
    buffer.append(" .addMenu = ").append(addMenu).append('\n');
    buffer.append(" .delMenu = ").append(delMenu).append('\n');
    buffer.append("[/MMS]\n");
    return buffer.toString();
}
}