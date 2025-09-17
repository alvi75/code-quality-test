import java.util.*;

public class Translationtranslation_721 {
    public ByteBuffer read(int length, long position) {
        if(position >= size) {
            throw new IllegalArgumentException("Unable to read "+length+" bytes from "+position+" in stream of length "+size);
        }
        int toRead = (int)Math.min(length, size - position);
        return ByteBuffer.wrap(buffer, (int)position, toRead);
    }
}