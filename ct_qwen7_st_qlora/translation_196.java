import java.util.*;

public class Translation196 {
    public synchronized void setMultiValued(String dimName, boolean v) {
    DimConfig ft = fieldTypes.get(dimName);
    if (ft == null) {
        ft = new DimConfig();
        ft.isMultiValued = v;
        fieldTypes.put(dimName, ft);
    }
    else {
        ft.isMultiValued = v;
    }
}
}