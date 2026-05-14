import java.util.*;

public class Translation818 {
    1 public void preSerialize() {
    if (records.getTabpos() > 0) {
        TabIdRecord tir = records.getAt(records.getTabpos());
        if (tir.getTabid().length < boundsheets.size()) {
            fixTabIdRecord();
        }
    }
}
}