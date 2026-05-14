import java.util.*;

public class Translation761 {
    public void construct(CellValueRecordInterface rec, RecordStream rs,SharedValueManager sfm) {
    if (rec instanceof FormulaRecord) {
        FormulaRecord formulaRec = (FormulaRecord) rec;
        StringRecord cachedText = null;
        final Class<?> nextClass = rs.peekNextClass();
        if (nextClass == StringRecord.class) {
            cachedText = (StringRecord) rs.getNext();
        }
        insertCell(new FormulaRecordAggregate(formulaRec, cachedText, sfm));
    }
    else {
        insertCell(rec);
    }
}
}