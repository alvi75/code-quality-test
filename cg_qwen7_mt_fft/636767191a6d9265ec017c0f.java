import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size) {
        final byte[] old = this.data;
        this.data = new byte[size];
        System.arraycopy(old, 0, this.data, 0, old.length);
    }
}