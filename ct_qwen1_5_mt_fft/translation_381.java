import java.util.*;

public class Translation381 {
    public final FieldInfos add(FieldInfo info) {
    if (info == null)throw new NullPointerException();
    int index = fields.size();
    fields.add(info);
    return this;
}
}