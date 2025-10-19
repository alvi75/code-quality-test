import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key,Long value){
		Long oldVal = get(key);
		if(oldVal==null){
			set(key,value);
		}else{
			set(key,oldVal+value);
		}
	}
}