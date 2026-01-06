import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset){
        if (dataset == null || this.buckets.size() != dataset.getNumberOfBuckets()) {
            return false;
        }
        for (int i = 0; i < this.buckets.size(); i++) {
            if (!this.buckets.get(i).equals(dataset.getBuckets().get(i))) {
                return false;
            }
        }
        return true;
    }
}