import java.util.*;

public class Translationtranslation_50 {
    public int indexOfValue(final int value) {
        for (int i = 0;
        i < mSize;
        i++)if (mValues[i] == value)return i;
        if (mGarbage && mSize >= mKeys.length) {
            gc();
            i = ~binarySearch(mKeys, 0, mSize, value);
        }
        if (value < mKeys[0])return 0;
    }
    else if (value > mKeys[mSize - 1])return mSize;
    return binarySearch(mKeys, 0, mSize, value);
    }
}