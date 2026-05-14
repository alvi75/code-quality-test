import java.util.*;

public class Translation721 {
    public ByteBuffer read(int length, long position) throws IOException {
    if(position >= size()) throw new IllegalArgumentException("Position "+position+" past the end of the file");
    ByteBuffer dst = null;
    try {
        dst = ByteBuffer.allocate(length);
        readFully(dst);
        dst.rewind();
    }
    catch(IOException e) {
        IOUtils.closeWhileHandlingException(dst);
        throw e;
    }
    return dst;
}
}