import java.util.*;

public class Translation721 {
    public ByteBuffer read(long position, int length) throws IOException {
    if (position >= size) throw new IllegalArgumentException("position " + position + " past the end of the file");
    ByteBuffer dst = ByteBuffer.allocate(length);
    int worked = -1;
    if (writable) {
        dst = ByteBuffer.wrap(dst());
        worked = 0;
    }
    else {
        fileStream.position(position);
        dst = ByteBuffer.wrap(dst(), 0, length);
        worked = IOUtils.readFully(fileStream, dst.array()));
    }
    if (worked == -1) throw new EOFException();
    dst.flip();
    return dst;
}
}