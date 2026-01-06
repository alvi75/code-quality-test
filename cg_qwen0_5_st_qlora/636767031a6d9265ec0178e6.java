import java.util.*;

public class Generated_636767031a6d9265ec0178e6 {
    public static byte[] toPrimitive(final Byte[] array){
        if(array == null) {
            return null;
        }
        final int length = array.length;
        final byte[] result = new byte[length];
        for(int i = 0; i < length; i++) {
            result[i] = array[i].byteValue();
        }
        return result;
    }
}