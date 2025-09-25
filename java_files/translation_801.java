import java.util.*;

public class Translation801 {
    public static Record createSingleRecord(RecordInputStream in) {
    Integer sid = in.getSid();
    if (_recordCreatorsById.containsKey(sid)) {
        RecordCreator constructor = _recordCreatorsById.get(sid);
        return constructor.create(in);
    }
    else {
        return new UnknownRecord(in);
    }
}
@see #create(int) Method to implement: private static void registerRecordCreator(RecordCreator creator)
}