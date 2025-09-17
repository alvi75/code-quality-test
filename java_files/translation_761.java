import java.util.*;

public class Translationtranslation_761 {
    public void construct(CellValueRecordInterface[] recs, RecordStream rs, SharedValueManager sfm) {
        if (recs.length == 0) {
            return;
        }
        int nItems = recs.length;
        CellValueRecordInterface[] values = new CellValueRecordInterface[nItems];
        System.arraycopy(recs, 0, values, 0, nItems);
        for (int i = 0;
        i < nItems;
        i++) {
            values[i].rec = records.get(i);
            records.set(i, null);
        }
        nItems = removeNAs(values, nItems);
        records = values;
    }
}