import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset){
        if(offset + 2 > classFileBuffer.length)
            throw new RuntimeException("readShort: offset + 2 > classFileBuffer.length");
        return (short)((classFileBuffer[offset] << 8) + (classFileBuffer[offset + 1] & 0xFF));
    }
}