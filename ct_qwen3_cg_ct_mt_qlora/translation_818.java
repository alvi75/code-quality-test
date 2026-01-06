import java.util.*;

public class Translation818 {
    ublic void preSerialize() {
    if (records.tabpos > 0) {
        TabIdRecord tir = (TabIdRecord)records.get(records.tabpos);
        if (tir._tabids.length < boundsheets.size()) {
            fixTabIdRecord();
        }
    }
}
}