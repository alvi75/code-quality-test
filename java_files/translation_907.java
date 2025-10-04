import java.util.*;

public class Translation907 {
    public void processChildRecords(RecordVisitor rv) {
    convertRawBytesToEscherRecords();
    for (EscherRecord escherRecord : _escherRecords) {
        rv.visitRecord(escherRecord);
    }
}
}