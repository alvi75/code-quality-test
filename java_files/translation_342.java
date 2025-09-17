import java.util.*;

public class Translationtranslation_342 {
    public void trimToSize() {
        final int s = size;
        if (s == array.length) {
            return;
        }
        if (s == 0) {
            array = EmptyArray.OBJECT;
        }
        else {
            final object[] newArray = new object[s];
            System.arraycopy(array, 0, newArray, 0, s);
            array = newArray;
        }
        modCount++;
    }
}