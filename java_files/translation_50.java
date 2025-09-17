import java.util.*;

public class Translationtranslation_50 {
    public int indexOfValue(int value) {
        for (int i = 0;
        i < mSize;
        i++) {
            if (value == mValues[i]) {
                return i;
            }
        }
        return -1;
    }
}