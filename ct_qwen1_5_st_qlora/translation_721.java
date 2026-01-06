import java.util.*;

public class Translation721 {
    public ByteBuffer read(int length, long position) {
    if (position >= size()) {
        throw new IllegalArgumentException("Position " + position + " past the end of the file");
        ByteBuffer dst;
        int worked = -1;
        if (writable) {
            dst = ByteBuffer.allocate(length);
            worked = 0;
        }
        else {
            try {
                fileChannel.read(ByteBuffer.allocate(length), position);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            dst = ByteBuffer.wrap(dstBuf.array(), dstBuf.position(), dstBuf.limit());
        }
        if (worked == -1) {
            throw new IllegalArgumentException("Position " + position + " past the end of the file");
        }
        dst.flip();
        return dst;
    }
}