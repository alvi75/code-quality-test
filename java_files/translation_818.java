import java.util.*;

public class Translation818 {
    public void preSerialize() {
    if ( records.size() > 0 ) {
        TabIdRecord tir = (TabIdRecord) records.get(0);
        int nTabs = boundsheets.size();
        if (nTabs > 255) {
            throw new RuntimeException("Too many sheet names - must be <= 255 characters");
        }
        byte[] tabids = new byte[nTabs];
        for (int i=0;
        i<nTabs;
        i++) {
            SheetRangeEvaluator sre = getSheetEvaluator(i);
            tabids[i] = sre.getTabId();
        }
        tir.setTabids(tabids);
    }
}
}