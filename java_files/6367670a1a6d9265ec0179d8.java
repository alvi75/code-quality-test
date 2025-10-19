import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null)
            throw new NullPointerException("null buffer");

        int offset = 0;
        final int len = b.length;

        while (len > 0) {
            // check for more space in the output buffer
            int remainingInBuffer = this.buffer.remaining();
            int numToWrite = Math.min(len, remainingInBuffer);
            this.buffer.put(b, offset, numToWrite);

            offset += numToWrite;
            len -= numToWrite;
        }
    }
}