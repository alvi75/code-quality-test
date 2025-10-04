import java.util.*;

public class Translation818 {
    public void preSerialize() {
    if (records.getTabpos() > 0) {
        TabIdRecord tir = records.getTabidAt(records.getTabpos());
        if (tir.getTabids().length < _boundsheets.size()) {
            fixTabIdRecords();
        }
    }
}
}