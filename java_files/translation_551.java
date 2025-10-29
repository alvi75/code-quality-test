import java.util.*;

public class Translation551 {
    16 public boolean canAppendMatch() {
    for (int i = 0;
    i < heads.size();
    i++) {
        if (heads.get(i) != LastHead.INSTANCE) {
            return true;
        }
    }
    return false;
}
}