import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
    /**Read string from a buffer.**/
    public String readString() throws IOException {
        int len = getInt();
        if (len < 0) {
            throw new IOException("length is negative");
        }
        byte[] bytes = new byte[len];
        get(bytes);
        return new String(bytes, "UTF-8");
    }
}