import java.util.*;

public class Translation403 {
    public String toString() {
    StringBuilder buffer m = new StringBuilder();
    m.append("[MMS]\n");
    if (_comment != null) {
        m.append(_comment);
    }
    m.append(" .addMenu = ").append(Integer.toHexString(getAddMenu())).Append("\n");
    m.append(" .delMenu = ").append(Integer.toHexString(getDelMenuCount())).Append("\n");
    m.append("[/MMS]\n");
    return m.toString();
}
}