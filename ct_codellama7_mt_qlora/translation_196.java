import java.util.*;

public class Translation196 {
    public void setMultiValued(String dimName, boolean v) {
    synchronized (this) {
        DimConfig fieldType = fieldTypes.get(dimName);
        if (fieldType == null) {
            fieldTypes.put(dimName, new DimConfig(v));
        }
        else {
            fieldType.isMultiValued = v;
        }
    }
}
}