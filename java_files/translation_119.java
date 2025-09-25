import java.util.*;

public class Translation119 {
    public FieldInfo fieldInfo(String fieldName) {
    FieldInfo ret = byName.get(fieldName);
    if (ret == null) {
        throw new IllegalArgumentException("Unknown field name: " + fieldName);
    }
    return ret;
}
}