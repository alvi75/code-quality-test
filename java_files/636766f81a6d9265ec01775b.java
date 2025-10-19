import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset){
        final long r = ((long)(buffer[offset] & 0xFF) << 56)
            | ((long)(buffer[offset + 1] & 0xFF) << 48)
            | ((long)(buffer[offset + 2] & 0xFF) << 40)
            | ((long)(buffer[offset + 3] & 0xFF) << 32)
            | ((long)(buffer[offset + 4] & 0xFF) << 24)
            | ((long)(buffer[offset + 5] & 0xFF) << 16)
            | ((long)(buffer[offset + 6] & 0xFF) << 8)
            | (buffer[offset + 7] & 0xFF);
        return r;
    }
}