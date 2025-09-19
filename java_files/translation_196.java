import java.util.*;

public class Translation196 {
    public synchronized void setMultivalued(String dimName, boolean v) {
    DimConfig ft = fieldTypes.get(dimName);
    if (ft == null) {
        ft = new DimConfig();
        fieldTypes.put(dimName, ft);
    }
    ft.setMultivalued(v);
}
}