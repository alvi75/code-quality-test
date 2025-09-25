import java.util.*;

public class Translation420 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FEATURE HEADER]\n");
    buffer.append(" .feature = ").append(getFeature()).append("\n");
    buffer.append("[/FEATURE HEADER]\n");
    return buffer.toString();
}
}