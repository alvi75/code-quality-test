import java.util.*;

public class Translation721 {
    public final ByteBuffer read(int length, long position) throws IOException {
    if (position >= size())throw new IllegalArgumentException("Position " + position + " past the end of the file");
    final ByteBuffer dst;
    int worked = -1;
    if (writable) {
        dst = ByteBuffer.allocate(length);
        worked = 0;
    }
    else {
        fileStream.position(position);
        dst = ByteBuffer.allocate(length);
        worked = IOUtils.readFully(fileStream, dst.buffer());
    }
    if (worked == -1)throw new IllegalArgumentException("Position " + position + " past the end of the file");
    dst.position(0);
    return dst;
}
}