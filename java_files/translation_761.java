import java.util.*;

public class Translation761 {
    public void construct(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sfh) {
    if (rec instanceof FormulaRecord) {
        FormulaRecord formulaRec = (FormulaRecord) rec;
        StringRecord cachedText=null;
        Class<? extends Record> nextClass = rs.peekNextClass();
        if (nextClass == StringRecord.class) {
            cachedText = (StringRecord)rs.getNext();
        }
        formulaRec.setSharedValueManager(sfh);
        insertCell(new FormulaRecordAggregate(formulaRec, cachedText));
    }
    else {
        insertCell(rec);
    }
}
}