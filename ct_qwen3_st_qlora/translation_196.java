import java.util.*;

public class Translation196 {
    public synchronized void setMultiValued(String dimName, boolean v) {
    DimConfig fieldType = fieldTypes.get(dimName);
    if (fieldType == null) {
        fieldType = new DimConfig();
        fieldType.isMultiValued = v;
        fieldTypes.put(dimName, fieldType);
    }
    else {
        fieldType.isMultiValued = v;
    }
}
}