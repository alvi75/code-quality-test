import java.util.*;

public class Translation196 {
    public synchronized void setMultiValued(String dimName, boolean v) {
    if (!fieldTypes.containsKey(dimName)) {
        fieldTypes.put(dimName, new DimConfig(v));
    }
    else {
        DimConfig fieldType = fieldTypes.get(dimName);
        fieldType.setIsMultiValued(v);
    }
}
}