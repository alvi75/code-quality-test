import java.util.*;

public class Translation801 {
    public static Record createSingleRecord(RecordInputStream in1) {
    if (recordCreatorsById.containsKey(in1.sid)) {
        I_RecordCreator constructor = recordCreatorsById.get(in1.sid);
        return constructor.create(in1);
    }
    else {
        return new UnknownRecord(in1);
    }
}
}