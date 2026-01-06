import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key,Long value){
		if(!this.containsKey(key)){
			this.put(key,0L);
		}
		this.put(key,this.get(key)+value);
	}
}