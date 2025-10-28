import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    public final byte[] toByteArray() {
        if (buf == null) {
            throw new IllegalStateException("No data in buffer");
        }
        int len = buf.length;
        byte[] result = new byte[len];
        System.arraycopy(buf, 0, result, 0, len);
        return result;
    }
}