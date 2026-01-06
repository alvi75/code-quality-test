import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    /**Enlarge the byte vector data, by increasing it by the given size.**/
    private void enlarge(final int size) {
        if (size > 0) {
            final byte[] newBytes = new byte[bytes.length + size];
            System.arraycopy(bytes, 0, newBytes, 0, bytes.length);
            bytes = newBytes;
        }
    }
}