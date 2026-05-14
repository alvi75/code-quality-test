import java.util.*;

public class Generated_636767031a6d9265ec0178e6 {
    public static byte[] toPrimitive(final Byte[] array){
        if(array == null)
            return null;
        final byte[] n = new byte[array.length];
        for(int i=0; i<array.length; i++){
            n[i] = array[i].byteValue();
        }
        return n;
    }
}