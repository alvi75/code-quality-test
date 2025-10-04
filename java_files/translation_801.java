import java.util.*;

public class Translation801 {
    public static org.apache.poi.hssf.record.Record createSingleRecord(RecordInputStream in) {
    Class<? extends Record> recordClass = _recordCreatorsById.get(in.getSid());
    if (recordClass == null) {
        return new UnknownRecord(in);
    }
    else {
        try {
            return recordClass.getConstructor().newInstance(in);
        }
        catch (Exception e) {
}