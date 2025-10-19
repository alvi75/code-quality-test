import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
    public String readString()
        throws IOException
    {
        int len = 0;
        byte[] buf = new byte[128];
        while (true) {
            if ((len = in.read(buf, 0, 128)) == -1)
                return null;
            if (buf[len-1] == '\n')
                break;
        }
        return new String(buf, 0, len);
    }
}