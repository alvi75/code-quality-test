import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    /**Convert the original data array to a longer array.*/
    private void enlarge(final int size){
        final int[] tmp = new int[size];
        System.arraycopy(data, 0, tmp, 0, data.length);
        data = tmp;
    }
}