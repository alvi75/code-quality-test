import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    /**Put an array of bytes into this byte vector, enlarge the byte vector automatically if necessary.**/
    public ByteVector putByteArray(final byte[] byteArrayValue,
                                   final int byteOffset,
                                   final int byteLength) {
        // If there is not enough room in the current buffer to store the new data, allocate a larger one.
        if (this.buf.length - this.pos < byteLength) {
            // Allocate a larger buffer with more room for future additions.
            // Grow twice as fast as needed so that a few allocations are usually enough before running out of memory.
            final int newSize = Math.max(this.buf.length * 2, this.pos + byteLength);
            final byte[] newBuf = new byte[newSize];
            System.arraycopy(this.buf, 0, newBuf, 0, this.pos);
            this.buf = newBuf;
        }
        // Copy the new data into the buffer.
        System.arraycopy(byteArrayValue, byteOffset, this.buf, this.pos, byteLength);
        this.pos += byteLength;
        return this;
    }
}