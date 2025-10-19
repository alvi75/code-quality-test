import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
    /**Read string from a buffer.**/
    public String readString() throws IOException {
        int len = readInt();
        if (len < 0) return null;
        byte[] buf = new byte[len];
        readFully(buf);
        return new String(buf, "UTF-8");
    }
}