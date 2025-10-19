import java.util.*;

public class Generated_6367672d1a6d9265ec017c74 {
    public boolean remove(int val){
		if(!containsKey(val)) return false;
		int[] key = getKey(val);
		for (int i = 0; i < size; i++) {
			if(key[i] == val) {
				remove(i);
				return true;
			}
		}
		return false;
	}
}