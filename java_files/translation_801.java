import java.util.*;

public class Translation801 {
    public static org.apache.poi.hssf.record.Record createSingleRecord(RecordInputStream in) {
    Class<? extends Record> recordClass = _recordCreatorsById.get(Integer.valueOf(in.getSid()));
    if (recordClass == null) {
        return new UnknownRecord(in);
    }
}
try {
    return recordClass.newInstance();
}
catch (Exception e) {
    return new RuntimeException(e);
}
}