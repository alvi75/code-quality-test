import java.util.*;

public class Translation503 {
    0;
i++) {
    RecordBase rb = _recs.get(i);
    if (rb instanceof RecordAggregate) {
        ((RecordAggregate) rb).visitContainedRecords(rv);
    }
    else {
        rv.visitRecord((Record) rb);
    }
}
rv.visitRecord(EOFRecord.instance);
}
}