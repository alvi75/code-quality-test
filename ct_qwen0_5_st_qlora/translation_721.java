import java.util.*;

public class Translation721 {
    public final ByteBuffer read(int length, long position) throws IOException {
    if (position >= getSize())throw new IllegalArgumentException("Position " + position + " past the end of the file");
    ByteBuffer dst = ByteBuffer.allocate(length);
    try {
        int worked = 0;
        if (writable) {
            dst = ByteBuffer.allocateDirect(length);
        }
        else {
            dst = ByteBuffer.allocate(length);
            IOUtils.readFully(fileStream, dst.buffer());
        }
        if (dst.position() != 0) {
            throw new IllegalStateException("buffer not fully allocated (" + dst.position() + " vs " + length + ")");
        }
        dst.flip();
        return dst;
    }
    finally {
        if (position < getSize()) {
            fileStream.setPosition(position);
        }
    }
}
}