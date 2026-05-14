import java.util.*;

public class Translation503 {
    1 public void visitContainedRecords(RecordVisitor rv) {
    2 if (_recs.size() == 0)3 return ;
    4 rv.visitRecord(_bofRec);
    5 for (int i = 0;
    i < _recs.size();
    i++)6 {
        7 RecordBase rb = _recs.get(i);
        8 if (rb instanceof RecordAggregate)9 ((RecordAggregate) rb).visitContainedRecords(rv);
        10 else11 rv.visitRecord((Record) rb);
        12 }
        13 rv.visitRecord(EOFRecord.instance);
    }
}