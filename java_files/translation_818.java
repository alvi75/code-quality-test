import java.util.*;

public class Translation818 {
    1 public void preSerialize() {
    if (records.tabpos > 0) {
        TabIdRecord tir = (TabIdRecord) records.get(records.tabpos);
        if (tir.tabids.length < boundsheets.size()) {
            fixTabIdRecord();
        }
    }
}
}