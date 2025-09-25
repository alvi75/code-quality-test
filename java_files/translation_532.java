import java.util.*;

public class Translation532 {
    public E get(int location) {
    try {
        return a[location];
    }
    catch (IndexOutOfBoundsException e) {
        throw new IndexOutOfBoundsException(e.toString());
    }
}
}