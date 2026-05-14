import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    /**Read string from a buffer.**/
    @Override public String readString() throws IOException {
        int length = readInt();
        byte[] bytes = new byte[length];
        if (length > 0) {
            readFully(bytes);
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }
}