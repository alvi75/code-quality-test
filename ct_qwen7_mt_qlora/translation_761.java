import java.util.*;

public class Translation761 {
    1 public void construct(Record record, RecordStream rs, SharedValueManager svhm) {
    2 if (record instanceof FormulaRecord) {
        3 FormulaRecord formulaRec = (FormulaRecord) record;
        4 StringRecord cachedText = null;
        5 Type nextClass = rs.peekNextClass();
        6 if (nextClass == StringRecord.class) {
            7 cachedText = (StringRecord) rs.getNext();
            8 }
            else {
                9 cachedText = null;
                10 }
                11 insertCell(new FormulaRecordAggregate(formulaRec, cachedText, svhm));
                12 }
                else {
                    13 insertCell(record);
                    14 }
                }
}