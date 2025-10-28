import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size) {
        final byte[] newBytes = new byte[bytes.length + size];
        System.arraycopy(bytes, 0, newBytes, 0, bytes.length);
        bytes = newBytes;
    }
}