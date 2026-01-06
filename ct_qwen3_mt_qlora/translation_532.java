import java.util.*;

public class Translation532 {
    ublic E get(int location) {
    try {
        return a[location];
    }
    catch (ArrayIndexOutOfBoundsException e) {
        throw indexOutOfBoundsException(location, a.length);
    }
}
}