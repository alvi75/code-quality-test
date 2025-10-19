import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset){
		if (dataset == null || dataset.isEmpty())
			return false;
		
		for (int i = 0; i < buckets.length; i++) {
			if (!buckets[i].isCompatible(dataset.getBuckets()[i]))
				return false;
		}
		return true;
	}
}