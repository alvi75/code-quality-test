import java.util.*;

public class Translation409 {
    1 public final int codePointAt(final int index) {
    2 if (index < 0 || index >= length()) {
        3 throw new IndexOutOfBoundsException();
        4 }
        5 return Character.codePointAt(value, index, length());
    }
}