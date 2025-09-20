import java.util.*;

public class Translation801 {
    public static Record createSingleRecord(RecordInputStream in) {
    if (recordCreatorsById.containsKey(in.getSid())) {
        final I_RecordCreator constructor = recordCreatorsById.get(in.getSid());
        return constructor.create(in);
    }
    else {
        return new UnknownRecord(in);
    }
}
}