import java.util.*;

public class Translation503 {
    ublic void visitContainedRecords(RecordVisitor rv) {
    if (_recs.size() == 0)return;
    rv.visitRecord(_bofRec);
    for (RecordBase rb : _recs) {
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