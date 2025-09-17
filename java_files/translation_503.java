import java.util.*;

public class Translationtranslation_503 {
    public void visitContainedRecords(RecordVisitor rv) {
        if (_recs.isEmpty()) {
            return;
        }
        rv.visitRecord(_bofRec);
        for (int i = 0;
        i < _recs.size();
        i++) {
            RecordBase rb = _recs.get(i);
            if (rb instanceof RecordAggregate) {
                ((RecordAggregate) rb).visitContainedRecords(rv);
            }
            else {
                rv.visitRecord((org.apache.poi.hssf.record.Record) rb);
            }
        }
        rv.visitRecord(EOFRecord.instance);
    }
}