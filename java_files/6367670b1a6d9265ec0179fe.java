import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    @Override
    public void write(byte b[]) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        }
        if (count + b.length > buffer.length) {
            growBuffer(b.length);
        }
        System.arraycopy(b, 0, buffer, count, b.length);
        count += b.length;
    }
}