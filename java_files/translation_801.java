import java.util.*;

public class Translationtranslation_801 {
    public static org.apache.poi.hssf.record.Record createSingleRecord(RecordInputStream in) {
        int sid = in.getSid();
        if(_recordCreatorsById.containsKey(sid)) {
            return _recordCreatorsById.get(sid).create(in);
        }
        return new UnknownRecord(sid, in);
    }
}