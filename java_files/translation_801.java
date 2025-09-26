import java.util.*;

public class Translation801 {
    2013-05-29 public static Record createSingleRecord(RecordInputStream in1) {
    if (_recordCreatorsById.containsKey(in1.getSid())) {
        I_RecordCreator constructor = _recordCreatorsById.get(in1.getSid());
        return constructor.create(in1);
    }
    else {
        return new UnknownRecord(in1);
    }
}
}