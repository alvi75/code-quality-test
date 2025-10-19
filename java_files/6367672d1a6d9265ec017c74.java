import java.util.*;

public class Generated_6367672d1a6d9265ec017c74 {
    public boolean remove(int val){
		if(val < 0 || val >= size) return false;
		int index = val >> SHIFT;
		if(keys[index] == val){
			keys[index] = -1;
			values[index] = null;
			size--;
			return true;
		}
		for(int i = 1; i < numBuckets; i++){
			index = (val + i) >> SHIFT;
			if(keys[index] == val){
				keys[index] = -1;
				values[index] = null;
				size--;
				return true;
			}
			index = (val - i) >> SHIFT;
			if(keys[index] == val){
				keys[index] = -1;
				values[index] = null;
				size--;
				return true;
			}
		}
		return false;
	}
}