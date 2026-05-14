import java.util.*;

public class Translation119 {
    public FieldInfo fieldInfo(String fieldName) {
    FieldInfo ret = byName.get(fieldName);
    assert ret != null : "field not found (this=" + this + ")";
    return ret;
}
}