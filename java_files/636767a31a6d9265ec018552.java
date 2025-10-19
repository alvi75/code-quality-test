import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
    public String readString() throws IOException {
        int len = (int) readInt();
        byte[] bytes = new byte[len];
        this.read(bytes, 0, len);
        return new String(bytes);
    }
}