import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    /**
 * /**Convert the original data array to a longer array.
 **/
private void enlarge(final int size) {
        final int newLength = Math.max(size, 2 * data.length);
        final double[] newData = new double[newLength];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}