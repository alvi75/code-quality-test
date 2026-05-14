import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    /**Check whether the existed buckets are the same as the buckets.*/
    public boolean isCompatible(DataTable dataset){
        if (buckets == null) {
            return true;
        }
        int[] bucket = new int[dataset.getNumberOfColumns()];
        for(int i=0; i<bucket.length; i++){
            bucket[i] = dataset.getColumn(i).getBucket();
        }

        return Arrays.equals(bucket, buckets);
    }
}