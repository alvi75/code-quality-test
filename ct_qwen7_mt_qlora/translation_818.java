import java.util.*;

public class Translation818 {
    1 public void preSerialize() {
    2 if (records.tabpos > 0) {
        3 TabIdRecord tir = (TabIdRecord) records[records.tabpos];
        4 if (tir.getTabIds().length < boundsheets.size()) {
            5 fixTabIdRecord();
            6 }
            7 }
        }
}