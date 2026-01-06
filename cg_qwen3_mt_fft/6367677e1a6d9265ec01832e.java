import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    public Logger exists(String name){
		if(loggerMap.containsKey(name)){
			return loggerMap.get(name);
		}
		return null;
	}
}