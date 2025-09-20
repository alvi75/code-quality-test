import java.util.*;

public class Translation551 {
    ublic boolean canAppendMatch() {
    for (int i = 0;
    i < heads.size();
    i++) {
        if (!heads.get(i).equals(LastHead.INSTANCE)) {
            return true;
        }
    }
    return false;
}
}