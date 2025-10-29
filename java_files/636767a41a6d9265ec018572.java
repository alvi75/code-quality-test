import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    /**Read raw varint**/
    public long readRawVarint64() throws IOException {
        int bitCount = 0;
        while (true) {
            final int b = in.read();
            if (b < 0) {
                throw new EOFException("Unexpected end of stream");
            }
            bitCount |= (b & 0x7F) << bitCount;
            if ((b & 0x80) == 0) {
                return bitCount;
            }
        }
    }
}