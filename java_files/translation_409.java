import java.util.*;

public class Translation409 {
    public int codePointAt(int index) {
    if (index < 0 || index >= count) {
        throw new IndexOutOfBoundsException();
    }
    return Character.codePointAt(value, index, count);
}
}