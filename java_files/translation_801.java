import java.util.*;

public class Translation801 {
    public static Record createSingleRecord(RecordInputStream in) {
    if (recordCreators.containsKey(in.getSid())) {
        return recordCreators.get(in.getSid()).create(in);
    }
    else {
        return new UnknownRecord(in);
    }
}
}