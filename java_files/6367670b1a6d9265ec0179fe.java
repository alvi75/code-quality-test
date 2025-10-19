import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    @Override
    public void write(byte b[]) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        }
        int len = b.length;
        if (len > 0) {
            if (this.position + len > this.buffer.length) {
                this.buffer = Arrays.copyOf(this.buffer, this.position + len);
            }
            System.arraycopy(b, 0, this.buffer, this.position, len);
            this.position += len;
        }
    }
}