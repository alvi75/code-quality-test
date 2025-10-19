import java.util.*;

public class Generated_636767dd1a6d9265ec0186f3 {
    public void overrideName(String oldName,String newName){
		if (this.column.containsKey(oldName)) {
			this.column.put(newName, this.column.remove(oldName));
		}
	}
}