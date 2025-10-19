import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    /**
 * Check whether the existed buckets are the same as the buckets.
**/
public boolean isCompatible(DataTable dataset){
        if (buckets.size() != dataset.getBuckets().size()){
            return false;
        }
        for (int i = 0; i < buckets.size(); i++){
            if (!buckets.get(i).equals(dataset.getBuckets().get(i))){
                return false;
            }
        }
        return true;
    }
}