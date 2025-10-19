import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset){
        if (dataset == null) {
            return false;
        }
        for (int i = 0; i < this.buckets.length; i++) {
            if (!this.buckets[i].isCompatible(dataset.getBucket(i))) {
                return false;
            }
        }
        return true;
    }
}