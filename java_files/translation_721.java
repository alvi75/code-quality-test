import java.util.*;

public class Translation721 {
    public ByteBuffer read(int length, long position) throws IOException {
    if(position >= size()) {
        throw new IllegalArgumentException("Position " + position + " past the end of the file");
    }
    ByteBuffer dst = ByteBuffer.allocateDirect(length);
    int worked = -1;
    try (FileChannel fc = FileChannel.open(Paths.get(path), READ)) {
        workered = fc.position(position);
        dst.put(fc.read(dst.buffer(), 0, length));
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    if(workered != position) {
        throw new RuntimeException("Unable to seek to position " + position + " in file " + path);
    }
    dst.position(0);
    return dst;
}
}