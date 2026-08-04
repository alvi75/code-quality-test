import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
    public String readString() throws IOException {
        int len = readInt();
        if (len == -1) {
            return null;
        }
        if (len == 0) {
            return "";
        }
        byte[] buf = new byte[len];
        readFully(buf);
        return new String(buf, 0, len, "UTF-8");
    }
}