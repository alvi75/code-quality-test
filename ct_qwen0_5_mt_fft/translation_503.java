import java.util.*;

public class Translation503 {
    public void visitContainedRecords(RecordVisitor rv) {
    if (_recs.size() == 0)return;
    rv.visitRecord(_bofRec);
    for (Iterator<Record> it = _recs.iterator();
    it.hasNext();
    ) {
        Record r = it.next();
        if (r instanceof RecordAggregate) {
            ((RecordAggregate)r).visitContainedRecords(rv);
        }
        else {
            rv.visitRecord(r);
        }
    }
    rv.visitRecord(EOFRecord.instance);
}
}