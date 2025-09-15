import java.util.*;

public class Translationtranslation_721 {
    public ByteBuffer read(int length, long position) {
        if(position >= size) {
            throw new IllegalArgumentException("Position "+position+" past the end of the stream");
        }
        int worked = -1;
        ByteBuffer dst;
        try {
            dst = ByteBuffer.wrap(buffer, (int)position, length);
            worked = 1;
        }
        catch (IndexOutOfBoundsException e) {
            worked = 0;
        }
        if(worked == 1) {
            position += length;
            return dst;
        }
        else {
            throw new BufferUnderflowException();
        }
    }
}