import java.util.*;

public class Generated_636767031a6d9265ec0178e6 {
    public static byte[] toPrimitive(final Byte[] array) {
        if (array == null) {
            return null;
        }
        final byte[] result = new byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            result[i] = array[i].byteValue();
        }
        return result;
    }
}