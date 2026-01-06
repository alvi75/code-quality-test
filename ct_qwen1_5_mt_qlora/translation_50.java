import java.util.*;

public class Translation50 {
    public final int indexOfValue(final int value) {
    for (int i = 0;
    i < size();
    i++) {
        if (values()[i] == value) {
            return i;
        }
    }
    return -1;
}
}