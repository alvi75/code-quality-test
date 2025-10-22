import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**
 * Copy bytes from LinkedBuffer and return.
 **/
public final byte[] toByteArray(){
        if (this.size == 0) {
            return new byte[0];
        }
        byte[] result = new byte[this.size];
        int offset = 0;
        for (LinkedBuffer buffer : this.buffers) {
            System.arraycopy(buffer.data, buffer.offset, result, offset, buffer.size);
            offset += buffer.size;
        }
        return result;
    }
}