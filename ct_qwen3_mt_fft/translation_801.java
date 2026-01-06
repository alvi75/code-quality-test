import java.util.*;

public class Translation801 {
    public static Record createSingleRecord(RecordInputStream in) {
    if(_recordCreatorsById.containsKey(in.getSid())) {
        RecordCreator constructor = _recordCreatorsById.get(in.getSid());
        return constructor.create(in);
    }
    else {
        return new UnknownRecord(in);
    }
}
}