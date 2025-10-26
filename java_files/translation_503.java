import java.util.*;

public class Translation503 {
    ublic override void VisitContainedRecords(RecordVisitor rv){
    if (_recs.size == 0){
        return;
    }
    rv.visitRecord(_bofRec);
    foreach (RecordBase rb in _recs.values()){
        if (rb is RecordAggregate){
            ((RecordAggregate)rb).visitContainedRecords(rv);
        }
        else{
            rv.visitRecord((Record)rb);
        }
    }
    rv.visitRecord(EOFRecord.instance);
}
}