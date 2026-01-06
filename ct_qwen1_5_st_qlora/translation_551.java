import java.util.*;

public class Translation551 {
    public boolean canAppendMatch() {
    boolean result = false;
    for (int i = 0;
    i < heads.size();
    i++) {
        if (heads.get(i) != lastHead) {
            result = true;
            break;
        }
    }
    return result;
}
}