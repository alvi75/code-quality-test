import java.util.*;

public class Translation532 {
    @Override public E get(int location) {
    try {
        return a[location];
    }
    catch (IndexOutOfBoundsException e) {
        throw throwIndexOutOfBoundsException(location, a.length);
    }
}
}