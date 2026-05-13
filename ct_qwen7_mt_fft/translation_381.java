import java.util.*;

public class Translation381 {
    public final void add(FieldInfos other) {
    assert assertNotFinished();
    for (int i = 0;
    i < other.fields.size();
    i++) {
        add(other.fields.get(i));
    }
}
}