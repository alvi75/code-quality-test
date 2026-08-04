import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    private void enlarge(final int size){
        final int newSize = size + 1;
        final int[] newData = new int[newSize];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}