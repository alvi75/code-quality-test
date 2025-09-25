import java.util.*;

public class Translation532 {
    public E get(int location) {
    try {
        return a[location];
    }
    catch (ArrayIndexOutOfBoundsException e) {
        throw new IndexOutOfBoundsException(e.getMessage());
    }
}
}