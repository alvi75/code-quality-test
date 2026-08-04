import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key,Long value){
		if(this.map.containsKey(key)){
			this.map.put(key, this.map.get(key)+value);
		}else{
			this.map.put(key, value);
		}
	}
}