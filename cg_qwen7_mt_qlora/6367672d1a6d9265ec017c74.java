import java.util.*;

public class Generated_6367672d1a6d9265ec017c74 {
    /**Remove a value from the values if the map keys contains the val. Returns true if actually removed, and false otherwise.**/
	public boolean remove(int val){
		if(!containsKey(val)) return false;
		int[] vals = getValues();
		for(int i=0; i<vals.length; i++){
			if(vals[i] == val) {
				remove(i);
				return true;
			}
		}
		throw new RuntimeException("Error in remove");
	}
}