import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**Copy bytes from LinkedBuffer and return.**/
    public final byte[] toByteArray(){
        int size = 0;
        for (LinkedBuffer buffer : buffers) {
            size += buffer.size();
        }
        byte[] result = new byte[size];
        int offset = 0;
        for (LinkedBuffer buffer : buffers) {
            System.arraycopy(buffer.array(), buffer.offset(), result, offset, buffer.size());
            offset += buffer.size();
        }
        return result;
    }
}