import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    /**Convert the original data array to a longer array.**/
    private void enlarge(final int size){
        if(size > 0 && size > this.data.length){
            final int newLength = (int)(size * 1.5);
            final double[] newData = new double[newLength];
            System.arraycopy(this.data, 0, newData, 0, this.data.length);
            this.data = newData;
        }
    }
}