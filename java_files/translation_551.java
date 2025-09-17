import java.util.*;

public class Translationtranslation_551 {
    public boolean canAppendMatch() {
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