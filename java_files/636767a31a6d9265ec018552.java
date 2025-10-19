import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
    public String readString() throws IOException {
        int len = (int) readInt();
        if (len < 0)
            return null;
        byte[] data = new byte[len];
        readFully(data);
        return new String(data, "UTF-8");
    }
}