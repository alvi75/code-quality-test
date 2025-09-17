import java.util.*;

public class Translationtranslation_381 {
    public final void add(FieldInfos other) {
        assert assertNotFinished();
        for (int i = 0;
        i < other.numFields;
        i++) {
            add(other.fields[i]);
        }
    }
}