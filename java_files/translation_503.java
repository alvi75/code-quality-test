import java.util.*;

public class Translation503 {
    public void visitContainedRecords(RecordVisitor rv) {
    if (_recs.isEmpty()) {
        return;
    }
    rv.visitRecord(_bofRec);
    for (Object rec : _recs) {
        if (rec instanceof RecordAggregate) {
            ((RecordAggregate) rec).visitContainedRecords(rv);
        }
        else {
            rv.visitRecord(rec);
        }
    }
    rv.visitRecord(EOFRecord.instance);
}
}