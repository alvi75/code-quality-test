import java.util.*;

public class Translation551 {
    public boolean canAppendMatch() {
    for (int i = 0;
    i < heads.length;
    i++) {
        if (heads[i].isCurrent())return true;
    }
    return false;
}
}