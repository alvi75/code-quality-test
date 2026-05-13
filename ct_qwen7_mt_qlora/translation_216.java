import java.util.*;

public class Translation216 {
    0 public static CharBuffer wrap(char[] array, int start, int charCount) {
    1 final int length = array.length;
    2 if (start < 0 || charCount > length - start || charCount < 0)3 throw new IndexOutOfBoundsException();
    4 return new ReadWriteCharArrayBuffer(array, start, charCount);
}
}