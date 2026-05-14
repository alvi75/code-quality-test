import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**Copy bytes from LinkedBuffer and return.**/
    public final byte[] toByteArray(){
        int size = 0;
        for(LinkedBuffer buffer : buffers){
            size += buffer.offset;
        }
        byte[] result = new byte[size];
        int pos = 0;
        for(LinkedBuffer buffer : buffers){
            System.arraycopy(buffer.buf, 0, result, pos, buffer.offset);
            pos += buffer.offset;
        }
        return result;
    }
}