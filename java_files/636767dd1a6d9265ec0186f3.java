import java.util.*;

public class Generated_636767dd1a6d9265ec0186f3 {
    public void overrideName(String oldName,String newName){
		if(columnMap.containsKey(oldName)){
			columnMap.put(newName,columnMap.get(oldName));
			columnMap.remove(oldName);
		}
	}
}