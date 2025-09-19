import java.util.*;

public class Translation761 {
    public void construct(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sval) {
    if (rec instanceof FormulaRecord) {
        FormulaRecord fr = (FormulaRecord) rec;
        if( rs.peekNextSid()==ContinueRecord.sid ) {
            _linkPtg = new ContinueRecord(rs);
        }
    }
    Ptg[] ptgs = FR.toTokens(fr.getFormula());
    Ptg[] arrayValues = FR.toTokens(rs.getNextRecord().getFormula());
    if (arrayValues != null) {
        for(int i=0;
        i<ptgs.length;
        i++) {
            if (ptgs[i].isArrayFormula()) {
                Arrays.fill(arrayValues, ptgs[i]);
            }
        }
        Ptg result = OperandResolver.getSingleValue(ptgs[i], srcRowIndex, srcColumnIndex);
        if(result instanceof RefEval) {
            result = ((RefEval)result).getInnerValueEval();
        }
        int nColumns = _valuesAgg.getNumColumns();
        if (nColumns > 1) {
            return ErrorEval.NUM_ERROR;
        }
        return result;
    }
    throw new RuntimeException("Invalid cell type for formula record");
}
else if (rec instanceof ArrayRecord) {
    ArrayRecord ar = (ArrayRecord)rec;
    int nItems = ar.getItemCount();
    if (nItems < 0) {
        throw new RuntimeException("Array records must have a positive number of items.");
    }
    _list.add(rec);
    continue;
}
if (rec instanceof MulBlankRecord) {
    _list.add(rec);
    continue;
}
if (!(rec instanceof BlankRecord)) {
    {
        if (true) throw new RuntimeException("Unexpected record type (" + rec.getClass().getName() + ")");
    }
}
_list.add(rec);
}
}