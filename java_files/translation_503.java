import java.util.*;

public class Translationtranslation_503 {
    public void visitContainedRecords(RecordVisitor rv) {
        if (_recs.isEmpty()) {
            return;
        }
        rv.visitRecord(_bofRec);
        _recs.forEach(rv::visitRecord);
    }
}