import java.util.*;

public class Translation119 {
    public FieldInfo getFieldInfo(String fieldName) {
    Map.Entry<String, FieldInfo> entry = byName.get(fieldName);
    if (entry == null) {
        throw new IllegalArgumentException("Unknown field name '" + fieldName + "'");
    }
    return entry.getValue();
}
}