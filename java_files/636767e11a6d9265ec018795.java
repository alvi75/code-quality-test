import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset) {
        if (this.getBucketCount() != dataset.getBucketCount()) {
            return false;
        }
        for (int i = 0; i < this.bucketCount; i++) {
            if (!this.buckets[i].isCompatible(dataset.getBuckets()[i])) {
                return false;
            }
        }

        return true;
    }
}