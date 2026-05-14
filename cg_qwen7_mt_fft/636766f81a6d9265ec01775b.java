import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset){
        if(offset<0 || offset>=mLength){
            throw new IllegalArgumentException("Asked to read "+offset+" bytes from buffer of length "+mLength);
        }
        final byte b = mBuffer[offset];
        // Make it unsigned first.
        long l = 0x00000000000000FFL & ((long)b);
        for(int i=1; i<8; ++i){
            l <<= 8;
            l |= (0x00000000000000FFL & ((long)mBuffer[offset+i]));
        }
        return l;
    }
}