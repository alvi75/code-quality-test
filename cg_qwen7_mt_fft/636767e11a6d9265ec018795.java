import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset) {
        if (this.size() != dataset.size()) return false;
        for (String key : this.keySet()){
            Bucket bucket1 = getBucket(key);
            Bucket bucket2 = dataset.getBucket(key);
            if (!bucket1.isCompatible(bucket2)) return false;
        }
        return true;
    }
}