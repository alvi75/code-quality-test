import java.util.*;

public class Translation409 {
    public int codePointAt(int index) {
    if (index < 0 || index >= count) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + count);
    }
    return CharHelper.codePointAt(value, index, count);
}
}