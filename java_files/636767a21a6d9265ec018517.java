import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**Copy bytes from LinkedBuffer and return.**/
public final byte[] toByteArray(){
        int len = this.length;
        byte[] buf = new byte[len];
        System.arraycopy(this.buffer, 0, buf, 0, len);
        return buf;
    }
}