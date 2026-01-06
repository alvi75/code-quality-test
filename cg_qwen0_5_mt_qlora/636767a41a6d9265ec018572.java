import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    /**Read raw varint**/
    public long readRawVarint64() throws IOException {
        int bits = 0;
        long value = 0;

        while (true) {
            int b = in.read();
            if (b < 0) {
                throw new EOFException("Unexpected end of file");
            }
            bits |= (b & 0x7F) << (bits * 7);
            if ((b & 0x80) == 0) {
                return value | (bits << 32);
            }
            bits <<= 7;
        }
    }
}