import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    /**
     * Read string from a buffer.
     */
    @Override
    public String readString() throws IOException {
        int len = readInt();
        if (len < 0) {
            throw new EOFException("EOF while reading string");
        }
        byte[] bytes = new byte[len];
        read(bytes);
        return new String(bytes, "UTF-8");
    }
}