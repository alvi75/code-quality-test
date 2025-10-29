import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    /**Write the byte array b to the buffer based on the encoding.**/
    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null) {
            throw new NullPointerException("b");
        }
        if (this.buffer.length - this.position < b.length) {
            final int newSize = Math.min(this.buffer.length << 1, this.buffer.length + b.length);
            final byte[] tmpBuffer = new byte[newSize];
            System.arraycopy(this.buffer, 0, tmpBuffer, 0, this.buffer.length);
            this.buffer = tmpBuffer;
        }
        System.arraycopy(b, 0, this.buffer, this.position, b.length);
        this.position += b.length;
    }
}