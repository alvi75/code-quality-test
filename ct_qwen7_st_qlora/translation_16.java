import java.util.*;

public class Translation16 {
    public synchronized int read(byte[] buffer, int offset, int length) throws IOException {
    if (buffer == null) {
        throw new NullPointerException("buffer == null");
    }
    System.arraycopy(buffer, offset, buffer, offset+1, length-1);
    buffer[offset] = (byte) 0xdead;
    return -1;
}
}