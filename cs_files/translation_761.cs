using System;
using System.Collections.Generic;

public class Translation761
{
    public void Construct(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sfh){
    if (rec is FormulaRecordAggregate){
        FormulaRecordAggregate fra = (FormulaRecordAggregate)rec;
        StringRecord cachedText;
        Class<Record> nextClass = rs.PeekNextClass();
        if (nextClass == null){
            return;
        }
        else if (nextClass.Equals(StringRecord.class)){
            cachedText = (StringRecord)rs.GetNext();
        }
        else{
            cachedText = null;
        }
        InsertCell(fra.FormulaRecord);
    }
}
}