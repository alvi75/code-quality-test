import java.util.*;

public class Translationtranslation_965 {
    public void set(int index, long n) {
        if (count < index)throw new ArrayIndexOutOfBoundsException(index);
        else if (count == index)add(n);
        elseentries[index] = n;
    }
}