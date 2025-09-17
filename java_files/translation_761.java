public void construct(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sfh) {
    if (rec instanceof FormulaRecord) {
        FormulaRecord formulaRec = (FormulaRecord) rec;
        StringRecord cachedText=null;
        Class<? extends Record> nextClass = rs.peekNextClass();
        if (nextClass == StringRecord.class) {
            cachedText = (StringRecord)rs.getNext();
        }
        formulaRec.setCachedText(cachedText);
        addCell(formulaRec);
    }
    else {
        addCell(rec);
    }
}