import java.util.*;

public class Translation196 {
    1. public synchronized void setMultiValued(String dimName, boolean v) {
    DimConfig ft = fieldTypes.get(dimName);
    if (ft == null) {
        ft = new DimConfig();
        ft.multiValued = v;
    }
    else {
        ft.multiValued = v;
    }
    fieldTypes.put(dimName, ft);
}
}