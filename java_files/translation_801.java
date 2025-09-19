import java.util.*;

public class Translation801 {
    ublic static org.apache.poi.hssf.record.Record createSingleRecord(RecordInputStream in) {
    Class<? extends Record> aRecordClass = _recordCreatorsById.get(Integer.valueOf(in.getSid()));
    if (aRecordClass == null) {
        return new UnknownRecord(in);
    }
    else {
        try {
            return aRecordClass.getConstructor().newInstance();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
}