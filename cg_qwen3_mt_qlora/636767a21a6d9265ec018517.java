import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**Copy bytes from LinkedBuffer and return.**/
public final byte[] toByteArray(){
        int len = 0;
        for (LinkedBuffer b : buffers) {
            len += b.length();
        }
        byte[] result = new byte[len];
        int pos = 0;
        for (LinkedBuffer b : buffers) {
            System.arraycopy(b.buffer, b.offset, result, pos, b.length());
            pos += b.length();
        }
        return result;
    }
}