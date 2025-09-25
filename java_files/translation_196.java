import java.util.*;

public class Translation196 {
    public synchronized void setMultiValued(String dimName, boolean v) {
    DimConfig fc = fieldTypes.get(dimName);
    if (fc == null) {
        fc = new DimConfig();
        fieldTypes.put(dimName, fc);
    }
    fc.isMultiValued = v;
}
}