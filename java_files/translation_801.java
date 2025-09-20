import java.util.*;

public class Translation801 {
    ublic static Record createSingleRecord(RecordInputStream in) {
    if (_recordCreatorsById.containsKey(in.getSid())) {
        final I_RecordCreator constructor = _recordCreatorsById.get(in.getSid());
        return constructor.create(in);
    }
    else {
        return new UnknownRecord(in);
    }
}
}