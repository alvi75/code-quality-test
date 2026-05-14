import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    public final byte[] toByteArray(){
        if (this.size == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        int len = this.size;
        byte[] result = new byte[len];
        for (int i=0; i < len; ++i){
            result[i] = this.buf[i];
        }
        return result;
    }
}