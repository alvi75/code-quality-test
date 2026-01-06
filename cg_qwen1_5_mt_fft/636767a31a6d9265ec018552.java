import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
    public String readString()
        throws IOException {
        int len = (is.read() << 8) + is.read();
        return new String(buf, pos, len, charset);
    }
}