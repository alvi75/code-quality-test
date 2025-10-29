import java.util.*;

public class Translation503 {
    public void visitContainedRecords(RecordVisitor rv) {
    if ( _recs.size() == 0 ) return ;
    rv.visitRecord(_bofRec);
    for (Iterator<RecordBase> it = _recs.iterator();
    it.hasNext();
    ) {
        RecordBase rb = it.next();
        if (rb instanceof RecordAggregate) ((RecordAggregate) rb).visitContainedRecords(rv);
        else rv.visitRecord(rb);
    }
    rv.visitRecord(EOFRecord.instance);
}
}