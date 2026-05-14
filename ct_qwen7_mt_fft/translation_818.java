import java.util.*;

public class Translation818 {
    public void preSerialize() {
    if (records.getTabpos() > 0) {
        final TabIdRecord tpr = records.get( records.getTabpos()-1 );
        if (tpr._tabids.length < getBoundSheetRecords().size()) fixTabIdRecord(tpr);
    }
}
}