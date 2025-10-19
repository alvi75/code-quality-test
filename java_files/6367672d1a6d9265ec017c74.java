import java.util.*;

public class Generated_6367672d1a6d9265ec017c74 {
    public boolean remove(int val){
		if(containsKey(val)){
			int[] vals = get(val);
			for(int i=0;i<vals.length;i++){
				remove(vals[i]);
			}
			return true;
		}
		return false;
	}
}