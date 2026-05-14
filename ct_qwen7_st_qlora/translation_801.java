import java.util.*;

public class Translation801 {
    public static Record createSingleRecord(RecordInputStream in) {
    final I_RecordCreator constructor = _recordCreatorsById.get(in.getSid());
    if (constructor == null) {
        return new UnknownRecord(in);
    }
    else {
        return constructor.create(in);
    }
}
}