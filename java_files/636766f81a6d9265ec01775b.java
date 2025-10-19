import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset){
        if (offset >= length) throw new IndexOutOfBoundsException();
        final byte[] bytes = new byte[8];
        this.readBytes(offset,bytes);
        return Long.valueOf(new String(bytes));
    }
}