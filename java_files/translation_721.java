import java.util.*;

public class Translation721 {
    public ByteBuffer read(final int length, final long position) {
    if (position >= size()) throw new IllegalArgumentException("Position " + position + " past the end of the file");
    final ByteBuffer dst;
    int worked = -1;
    if (writable) {
        dst = ByteBuffer.createBuffer(length);
        worked = 0;
    }
    else {
        try {
            fileStream.position(position);
            worked = IOUtils.readFully(fileStream, dst.buffer());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (worked != -1) {
            dst.position(0);
        }
        else {
            throw new IllegalArgumentException("Position " + position + " past the end of the file");
        }
    }
    return dst;
}
}