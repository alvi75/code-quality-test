import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    private void enlarge(final int size) {
        if (size > this.data.length) {
            final int newLength = Math.max(size, this.data.length * 2);
            final byte[] newData = new byte[newLength];
            System.arraycopy(this.data, 0, newData, 0, this.data.length);
            this.data = newData;
        }
    }
}