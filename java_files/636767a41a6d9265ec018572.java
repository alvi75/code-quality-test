import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64()
        throws IOException {
        int b = in.read();
        if (b < 0) {
            throw new EOFException("Unexpected end of file");
        }
        long i = b & 0x7f;
        if ((b & 0x80) == 0) {
            return i;
        }
        b = in.read();
        if (b < 0) {
            throw new EOFException("Unexpected end of file");
        }
        i |= (long)(b & 0x7fl) << 7;
        if ((b & 0x80) == 0) {
            return i;
        }
        b = in.read();
        if (b < 0) {
            throw new EOFException("Unexpected end of file");
        }
        i |= (long)(b & 0x7fl) << 14;
        if ((b & 0x80) == 0) {
            return i;
        }
        b = in.read();
        if (b < 0) {
            throw new EOFException("Unexpected end of file");
        }
        i |= (long)(b & 0x7fl) << 21;
        if ((b & 0x80) == 0) {
            return i;
        }
        b = in.read();
        if (b < 0) {
            throw new EOFException("Unexpected end of file");
        }
        i |= (long)(b & 0x7fl) << 28;
        if ((b & 0x80) == 0) {
            return i;
        }
        b = in.read();
        if (b < 0) {
            throw new EOFException("Unexpected end of file");
        }
        i |= (long)(b & 0x7fl) << 35;
        if ((b & 0x80) == 0) {
            return i;
        }
        b = in.read();
        if (b < 0) {
            throw new EOFException("Unexpected end of file");
        }
        i |= (long)(b & 0x7fl) << 42;
        if ((b & 0x80) == 0) {
            return i;
        }
        b = in.read();
        if (b < 0) {
            throw new EOFException("Unexpected end
}