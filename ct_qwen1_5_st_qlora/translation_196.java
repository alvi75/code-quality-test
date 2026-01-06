import java.util.*;

public class Translation196 {
    public synchronized void setMultiValued(String dimName, boolean v) {
    DimConfig fieldType;
    if (!fieldTypes.containsKey(dimName)) {
        fieldTypes.put(dimName, new DimConfig(v));
    }
    else {
        fieldType = fieldTypes.get(dimName);
        fieldType.setIsMultiValued(v);
    }
}
}