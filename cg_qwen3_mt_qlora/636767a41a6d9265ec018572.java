import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    /**Read raw varint**/
public long readRawVarint64() throws IOException {
        int shift = 0;
        long result = 0;
        while (true) {
            final byte b = readByte();
            if ((b & 0x7F) == b) {
                return result | (b << shift);
            }
            result |= (b & 0x7F) << shift;
            shift += 7;
            if (shift >= 64) {
                throw new IOException("Too many bytes when decoding varint.");
            }
        }
    }
}