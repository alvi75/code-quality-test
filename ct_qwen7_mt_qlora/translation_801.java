import java.util.*;

public class Translation801 {
    0;
int sid = in1.getSid();
if (sid >= 0 && sid < _recordCreatorsBySid.Length) {
    I_RecordCreator creator = _recordCreatorsBySid[sid];
    if (creator != null) {
        return creator.create(in1);
    }
}
return new UnknownRecord(in1);
}
}