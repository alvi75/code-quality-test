import java.util.*;

public class Translation196 {
    01 public void setMultiValued(String dimName, boolean v) {
    synchronized (this) {
        if (!fieldTypes.containsKey(dimName)) {
            fieldTypes.put(dimName, new DimConfig(v));
        }
        else {
            DimConfig fieldType = fieldTypes.get(dimName);
            fieldType.isMultiValued = v;
        }
    }
}
}
}