import java.util.*;

public class Translation196 {
    public synchronized void setMultiValued(String dimName, boolean v) {
    DimConfig fieldType = fieldTypes.get(dimName);
    if (fieldType == null) {
        fieldTypes.put(dimName, new DimConfig(v));
    }
    else {
        fieldType.setIsMultiValued(v);
    }
}
}