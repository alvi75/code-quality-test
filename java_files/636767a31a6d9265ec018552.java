import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
    public String readString() throws IOException {
        int len = 0;
        byte[] buf = new byte[1024];
        while (true) {
            int n = in.read(buf, 0, buf.length);
            if (n < 0) {
                throw new EOFException();
            }
            if (n == 0) {
                return "";
            }
            len += n;
            if (len > buf.length) {
                buf = Arrays.copyOf(buf, buf.length * 2);
            }
            System.arraycopy(buf, 0, buf, 0, len);
            try {
                //System.out.println("read: " + new String(buf));
                return new String(buf, 0, len);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}