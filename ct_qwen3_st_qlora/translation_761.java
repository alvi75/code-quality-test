import java.util.*;

public class Translation761 {
    ublic void construct(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sfh) {
    if (rec instanceof FormulaRecord) {
        FormulaRecord formulaRec = (FormulaRecord)rec;
        StringRecord cachedText = null;
        Class<?> nextClass = rs.peekNextClass();
        if (nextClass == StringRecord.class) {
            cachedText = (StringRecord) rs.getNext();
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