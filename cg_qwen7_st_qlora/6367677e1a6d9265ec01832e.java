import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    public Logger exists(String name){
		if(name == null || name.isEmpty()){
			return null;
		}
		
		Logger l = loggers.get(name);
		if(l != null) {
			return l;
		}

		l = new Logger(name);
		loggers.put(name,l);

		return l;
	}
}