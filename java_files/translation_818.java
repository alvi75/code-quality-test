import java.util.*;

public class Translationtranslation_818 {
    public void preSerialize() {
        if ( records.size() > 0 ) {
            TabIdRecord tbr = TabIdRecord.createForAddInFunctions();
            int idx = findFirstRecordLocBySid(TabIdRecord.sid);
            if (idx == -1) throw new RuntimeException("Could not find a valid location for the tabid record");
            _tabids.add(idx, tbr);
        }
    }
}