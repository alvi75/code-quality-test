import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    @Override
    public void write(byte b[]) throws IOException {
        if (this.currentPos == this.buf.length) {
            this.buf = Arrays.copyOf(this.buf, this.buf.length * 2);
        }
        System.arraycopy(b, 0, this.buf, this.currentPos, b.length);
        this.currentPos += b.length;
    }
}