import java.util.*;

public class Translation551 {
    1 public boolean canAppendMatch() {
    2 for (int i = 0;
    i < heads.size();
    i++) {
        3 if (!(heads.get(i) instanceof LastHead)) {
            4 return true;
            5 }
            6 }
            7 return false;
        }
}