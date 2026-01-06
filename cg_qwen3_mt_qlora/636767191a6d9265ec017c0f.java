import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size) {
        final int newSize = this.data.length + size;
        final byte[] newData = new byte[newSize];
        System.arraycopy(this.data, 0, newData, 0, this.data.length);
        this.data = newData;
    }
}