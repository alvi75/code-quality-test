import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset){
        final byte[] b = this.classFileBuffer;
        return (short) ((b[offset] << 8) + (b[offset+1] & 0xFF));
    }
}