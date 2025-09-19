import java.util.*;

public class Translation532 {
    public E get(int index) {
    try {
        return a[index];
    }
    catch (IndexOutOfBoundsException e) {
        throw new ArrayListIndexOutOfBoundsException(index, a.length);
    }
}
}