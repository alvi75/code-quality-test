import java.util.*;

public class Translation818 {
    public void preSerialize() {
    if ( records.getTabpos() > 0 ) {
        TabIdRecord tir = (TabIdRecord) records.get(records.getTabpos());
        if (tir._tabids.length < boundsheets.size()) {
            fixTabIdRecord();
        }
    }
}
}