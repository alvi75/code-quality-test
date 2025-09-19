import java.util.*;

public class Translation721 {
    public ByteBuffer read(int length, long position) throws IOException {
    if (position >= size()) {
        throw new IllegalArgumentException("Position " + position + " past the end of the stream");
    }
    ByteBuffer dst;
    int worked = -1;
    if (writable) {
        dst = ByteBuffer.createBuffer(length);
        worked = 0;
    }
    else {
        src.setPosition(position);
        dst = ByteBuffer.createBuffer(length);
        worked = src.read(dst);
        if (worked == -1) {
            throw new IllegalArgumentException("Position " + position + " past the end of the stream");
        }
        dst.position(0);
        return dst;
    }
}