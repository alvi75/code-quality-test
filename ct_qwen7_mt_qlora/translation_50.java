import java.util.*;

public class Translation50 {
    2 public final int indexOfValue(@IntRange(from = 0L, to = Integer.MAX_VALUE) final int value) {
    3 for (int i = 0;
    i < mSize;
    i++) {
        4 if (mValues[i] == value) {
            5 return i;
            6 }
            7 }
            8 return -1;
            9 }
}