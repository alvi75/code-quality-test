import java.util.*;

public class Translation50 {
    public int indexOfValue(int value) {
    for (int i = 0;
    i < size();
    i++) {
        if (value == valueAt(i)) {
            return i;
        }
    }
    return -1;
}
}