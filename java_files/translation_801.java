import java.util.*;

public class Translation801 {
    public static Record createSingleRecord(RecordInputStream in) {
    if (recordCreators.containsKey(in.getSid())){
        final RecordCreator constructor = recordCreators.get(in.getSid());
        return constructor.create(in);
    }
    else {
        return new UnknownRecord(in);
    }
}
}