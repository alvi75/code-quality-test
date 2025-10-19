import java.util.*;

public class Generated_6367672d1a6d9265ec017c74 {
    public boolean remove(int val){
		if(val<0) return false;
		int pos = Arrays.binarySearch(keys,val);
		if(pos>=0){
			keys = ArrayUtils.remove(keys,pos);
			values = ArrayUtils.remove(values,pos);
			return true;
		}
		return false;
	}
}