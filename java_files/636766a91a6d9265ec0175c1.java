import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    private void enlarge(final int size){
        if(size < this.data.length) return;
        final int[] newdata = new int[2*size];
        System.arraycopy(this.data, 0, newdata, 0, this.data.length);
        this.data = newdata;
    }
}