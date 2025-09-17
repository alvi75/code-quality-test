import java.util.*;

public class Translationtranslation_298 {
    public static byte[] grow(byte[] array, int minSize) {
        assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?";
        if (array.length < minSize) {
            return growExact(array, oversize(minSize, Byte.BYTES));
        }
        elsereturn array;
    }
}