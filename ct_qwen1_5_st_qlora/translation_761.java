import java.util.*;

public class Translation761 {
    public void construct(CellValueRecordInterface rec, RecordStream rs,SharedValueManager sfh) {
    if (rec instanceof FormulaRecord) {
        FormulaRecord formulaRec = (FormulaRecord) rec;
        StringRecord cachedText = null;
        try {
            while (true) {
                final Class<?> nextClass = rs.peekNextClass();
                if (!nextClass.equals(StringRecord.class)) {
                    break;
                }
            }
            cachedText = (StringRecord) rs.getNext();
        }
    }
    else {
        cachedText = null;
    }
    insertCell(new FormulaRecordAggregate(formulaRec, cachedText, sfh));
}
}