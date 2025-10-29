import java.util.*;

public class Translation801 {
    ublic static Record CreateSingleRecord(RecordInputStream @in) {
    if (recordCreatorsById.containsKey(@in.sid)) {
        final I_RecordCreator constructor = recordCreatorsById.get(@in.sid);
        return constructor.create(@in);
    }
    else {
        return new UnknownRecord(@in);
    }
}
}