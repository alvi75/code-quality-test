import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    /**Enlarge the byte vector data, by increasing it by the given size.
@throws IOException if there is a problem resizing the file.
@since 1.0*/
private void enlarge(final int size) {
        final int newLength = this.data.length + size;
        final byte[] newData = new byte[newLength];
        System.arraycopy(this.data, 0, newData, 0, this.data.length);
        this.data = newData;
    }
}