import java.util.*;

public class Translation801 {
    public static org.apache.poi.hssf.record.Record createSingleRecord(RecordInputStream in) {
    if(_recordCreatorsById.containsKey(Integer.valueOf(in.getSid()))) {
        org.apache.poi.hssf.record.Record record = _recordCreatorsById.get(Integer.valueOf(in.getSid())).create(in);
        if(record instanceof UnknownRecord && !((UnknownRecord)record).getSid().equals(SupBookRecord.sid)) {
            log.log(DEBUG,"Create a specialized parser for sid=" + ((UnknownRecord)record).getSid());
        }
        return record;
    }
    else {
        return new UnknownRecord(in);
    }
}
}