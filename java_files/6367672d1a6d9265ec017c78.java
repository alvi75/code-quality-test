import java.util.*;

public class Generated_6367672d1a6d9265ec017c78 {
    public boolean insert(int val){
		if(this.containsKey(val)){
			return false;
		}
		this.put(val, val);
		return true;
	}
}