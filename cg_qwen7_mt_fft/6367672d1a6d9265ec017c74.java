import java.util.*;

public class Generated_6367672d1a6d9265ec017c74 {
    public boolean remove(int val){
		if (val < 0 || val >= numValues) {
			return false;
		}
		
		int index = binarySearch(val);
		if(index == -1){
			return false;
		} else {
			removeElement(index);
			return true;
		}
	}
}