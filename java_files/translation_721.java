import java.util.*;

public class Translation721 {
    public ByteBuffer read(int length, long position)throws IOException {
    if (position >= size)throw new IllegalArgumentException("Position " + position+ " past the end of the file");
    ByteBuffer dst;
    int worked = -1;
    if (writable) {
        dst = ByteBuffer.allocateDirect(length);
        worked = 0;
    }
    else {
        fileStream.seek(position);
        dst = ByteBuffer.allocateDirect(length);
        worked = IOUtils.readFully(fileStream, dst);
    }
    if(worked == -1)throw new IllegalArgumentException("Position " + position+ " past the end of the file");
    dst.position(0);
    return dst;
}
}