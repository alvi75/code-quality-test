import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    @Override
    public void write(byte b[]) throws IOException {
        if (b == null) {
            throw new NullPointerException("null");
        }
        if (this.buffer == null) {
            this.buffer = new byte[1024];
        }
        int len;
        while ((len = in.write(b)) != -1) {
            out.write(len);
        }
    }
}