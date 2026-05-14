import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key,Long value){
		if (value==null) return;
		Long oldValue = this.getLong(key);
		this.put(key,(oldValue==null?0:oldValue)+value);
	}
}