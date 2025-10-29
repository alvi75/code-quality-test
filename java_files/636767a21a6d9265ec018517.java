import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**Copy bytes from LinkedBuffer and return.**/
    public final byte[] toByteArray(){
        int len = 0;
        if (buffer != null) {
            len = buffer.remaining();
        }
        byte[] ret = new byte[len];
        if (buffer != null){
            buffer.get(ret);
        }
        return ret;
    }
}