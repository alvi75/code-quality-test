import java.util.*;

public class Translationtranslation_342 {
    public void trimToSize() {
        int s = size;
        if (s == array.length) {
            return;
        }
        if (s == 0) {
            clear();
            return;
        }
        object[] newArray = new object[s];
        System.arraycopy(array, 0, newArray, 0, s);
        array = newArray;
    }
}