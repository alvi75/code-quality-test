import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset){
		if (this.buckets.size() != dataset.getBuckets().size()) {
			return false;
		}
		
		for(int i=0; i<this.buckets.size(); i++){
			Bucket b1 = this.buckets.get(i);
			Bucket b2 = dataset.getBuckets().get(i);
			
			if(!b1.isCompatible(b2)){
				return false;
			}
		}
		
		return true;
	}
}