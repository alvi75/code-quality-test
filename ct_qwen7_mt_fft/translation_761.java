import java.util.*;

public class Translation761 {
    public void construct(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sfm) {
    if (rec instanceof FormulaRecord) {
        FormulaRecord formulaRec = (FormulaRecord) rec;
        StringRecord cr = (StringRecord) rs.peekNext();
        insertCell(new FormulaRecordAggregate(formulaRec, cr, sfm));
    }
    else {
        insertCell(rec);
    }
}
}