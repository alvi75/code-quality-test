import java.util.*;

public class Translation196 {
    public synchronized void setMultiValued(String dimName, boolean v) {
    if (!fieldTypes.containsKey(dimName)) {
        DimConfig config = new DimConfig();
        config.setIsMultiValued(v);
        fieldTypes.put(dimName, config);
    }
    else {
        fieldTypes.get(dimName).setIsMultiValued(v);
    }
}
}