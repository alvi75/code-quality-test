import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size){
        if (size < 0) {
            throw new IllegalArgumentException("Size must be positive");
        }
        final int oldSize = this.data.length;
        final byte[] newData = new byte[oldSize + size];
        System.arraycopy(data, 0, newData, 0, oldSize);
        this.data = newData;
    }
}