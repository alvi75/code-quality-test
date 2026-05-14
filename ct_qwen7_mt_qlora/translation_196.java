import java.util.*;

public class Translation196 {
    1 public synchronized void setMultiValued(String dimName, boolean v) {
    2 if (!fieldTypes.containsKey(dimName))3 fieldTypes.put(dimName, new DimConfig(v));
    4 else5 fieldTypes.get(dimName).isMultiValued = v;
}
}