import java.util.*;

public class Translation970 {
    public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("[SXDI]\n");
    for(int i=0;
    i<_field_1_fieldInfos.length;
    i++) {
        sb.append(" item["+i+"]_").append(getFieldInfo(i).appendDebugInfo(sb));
        sb.append('\n');
    }
    sb.append("[/SXDI]\n");
    return sb.toString();
}
}