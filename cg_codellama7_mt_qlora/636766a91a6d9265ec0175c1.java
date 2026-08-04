import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    public void enlarge(int size) {
        int newSize = size + (size >> 1);
        if (newSize < 0) {
            newSize = Integer.MAX_VALUE;
        }
        if (newSize <= data.length) {
            return;
        }
        Object[] newData = new Object[newSize];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}