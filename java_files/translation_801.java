import java.util.*;

public class Translation801 {
    ublic static Record createSingleRecord(RecordInputStream in1) {
    if (_recordCreatorsById.containsKey(in1.getSid())) {
        I_RecordCreator constructor = _recordCreatorsById.get(in1.getSid());
        return constructor.create(in1);
    }
    else {
        return new UnknownRecord(in1);
    }
}
}