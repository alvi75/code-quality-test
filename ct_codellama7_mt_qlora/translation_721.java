import java.util.*;

public class Translation721 {
    public ByteBuffer read(int length, long position) {
    if (position >= size) {
        throw new IllegalArgumentException("Position " + position + " past the end of the file");
    }
    ByteBuffer dst;
    int worked = -1;
    if (writable) {
        dst = ByteBuffer.allocate(length);
        worked = 0;
    }
    else {
        fileStream.position(position);
        dst = ByteBuffer.allocate(length);
        worked = IOUtils.readFully(fileStream, dst.array());
    }
    if (worked == -1) {
        throw new IllegalArgumentException("Position " + position + " past the end of the file");
    }
    dst.position(0);
    return dst;
}
}