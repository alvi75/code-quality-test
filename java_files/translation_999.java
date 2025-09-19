import java.util.*;

public class Translation999 {
    public String getClassName() {
    if (super.getCanonicalName() == null) {
        return getClass().getSimpleName();
    }
    String[] parts = super.getCanonicalName().split("$");
    StringBuilder sb = new StringBuilder(64);
    for (int i = 0;
    i < parts.length;
    i++) {
        if (i > 0) {
            sb.append('$');
        }
        sb.append(parts[i]);
    }
    return sb.toString();
}
}