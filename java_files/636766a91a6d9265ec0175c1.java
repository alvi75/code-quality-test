import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    /**Convert the original data array to a longer array.**/
    private void enlarge(final int size) {
        final int newLength = (size * 3) / 2;
        final byte[] newData = new byte[newLength];
        System.arraycopy(originalData, 0, newData, 0, size);
        originalData = newData;
    }
}