import java.util.*;

public class Translation503 {
    public void visitContainedRecords(RecordVisitor rv) {
    if (_recs.size() == 0)return;
    rv.visitRecord(_bofRec);
    for (int i=0;
    i<_recs.size();
    i++) {
        RecordBase rb=_recs.get(i);
        if (rb instanceof RecordAggregate) {
            ((RecordAggregate) rb).visitContainedRecords(rv);
        }
        else {
            rv.visitRecord(rb);
        }
    }
    rv.visitRecord(EOFRecord.instance);
}
}