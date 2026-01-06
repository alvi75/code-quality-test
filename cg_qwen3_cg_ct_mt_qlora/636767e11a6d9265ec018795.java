import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset){
		if (buckets.size() != dataset.getBuckets().size()) {
			return false;
		}
		
		for (int i = 0; i < buckets.size(); i++) {
			Bucket bucket1 = buckets.get(i);
			Bucket bucket2 = dataset.getBuckets().get(i);
			
			if (!bucket1.isCompatible(bucket2)) {
				return false;
			}
		}
		
		return true;
	}
}