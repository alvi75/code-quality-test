import java.util.*;

public class Translation119 {
    public FieldInfo getFieldInfo(String fieldName) {
    FieldInfo ret = byName.get(fieldName);
    if (ret == null && !byNumber.containsKey(fieldName)) {
        throw new IllegalArgumentException("Unknown field name " + fieldName);
    }
    return ret;
}
}