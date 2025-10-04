import java.util.*;

public class Translation503 {
    public void visitContainedRecords(RecordVisitor rv) {
    if (_recs.isEmpty()) {
        return;
    }
    rv.visitRecord(_bofRec);
    _recs.forEach(rv::visitRecord);
    rv.visitRecord(EOFRecord.instance);
}
}