import java.util.*;

public class Translation761 {
    public void construct(CellValueRecordInterface rec, RecordInputStream rs, SharedValueManager sfh) {
    if (rec instanceof FormulaRecord) {
        FormulaRecord formulaRec = (FormulaRecord)rec;
        StringRecord cachedText = null;
        final Class<?> nextClass = rs.peekNextClass();
        if (nextClass == StringRecord.class) {
            cachedText = (StringRecord)rs.getNext();
        }
        else {
            cachedText = null;
        }
        insertCell(new FormulaRecordAggregate(formulaRec, cachedText, sfh));
    }
    else {
        insertCell(rec);
    }
}
}