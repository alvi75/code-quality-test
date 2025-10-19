import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    public final byte[] toByteArray(){
        if (buf == null){
            throw new IllegalStateException("no buffer");
        }
        int len = position;
        if (len > buf.length) {
            byte[] tmp = new byte[len];
            System.arraycopy(buf, 0, tmp, 0, len);
            return tmp;
        } else {
            byte[] tmp = new byte[buf.length];
            System.arraycopy(buf, 0, tmp, 0, buf.length);
            return tmp;
        }
    }
}