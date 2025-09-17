import java.util.*;

public class Translationtranslation_801 {
    public static org.apache.poi.hssf.record.Record createSingleRecord(RecordInputStream in) {
        Class<? extends Record> recordClass = _recordCreatorsById.get(Integer.valueOf(in.getSid()));
        if (recordClass == null) {
            return new UnknownRecord(in);
        }
        try {
            return recordClass.getConstructor().newInstance(in);
        }
        Inserter ins = recordClass.getConstructor().newInstance();
        ins.readFully(in);
        return ins;
    }
    catch (Exception e) {
        throw new RuntimeException(e);
    }
    }
}