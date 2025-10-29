import java.util.*;

public class Translation532 {
    public E get(int location) {
    try {
        return a.get(location);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        throw new IndexOutOfBoundsException();
    }
}
}