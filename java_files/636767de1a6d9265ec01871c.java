import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key,Long value){
		Long current = get(key);
		if(current==null)
			put(key,value);
		else
			put(key,current+value);
	}
}