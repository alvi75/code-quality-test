import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset){
        if (offset + 2 > classFileBuffer.length) {
            throw new IllegalArgumentException("Offset "+offset+" is out of bounds");
        }
        byte[] bytes = new byte[2];
        System.arraycopy(classFileBuffer, offset, bytes, 0, 2);
        return Short.valueOf(new String(bytes));
    }
}