using System;
using System.Collections.Generic;

public class Translation503
{
    public override void VisitContainedRecords(RecordVisitor rv){
    if (_recs.Count == 0){
        return;
    }
    rv.VisitRecord(_bofRec);
    for (int i = 0;
    i < _recs.Count;
    i++){
        RecordBase rb = _recs[i];
        if (rb is RecordAggregate){
            ((RecordAggregate)rb).VisitContainedRecords(rv);
        }
        else{
            rv.VisitRecord((Record)rb);
        }
    }
    rv.VisitRecord(EOFRecord.instance);
}
}