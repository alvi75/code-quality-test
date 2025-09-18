import java.util.*;

public class Translation721 {
    public ByteBuffer read(int length, long position) throws IOException {
    if(position >= size) {
        throw new IllegalArgumentException("Position " + position + " past the end of the file");
    }
    byte[] dst;
    int worked = -1;
    if (writable) {
        dst = buffer;
        worked = 0;
    }
    else {
        fileStream.position(position);
        dst = buffer;
        worked = IOUtils.readFully(fileStream, dst);
    }
    if(worked == -1) {
        throw new IllegalArgumentException("Position " + position + " past the end of the file");
    }
    dst[position] = 0;
    return new ByteBuffer.wrap(dst);
}
}