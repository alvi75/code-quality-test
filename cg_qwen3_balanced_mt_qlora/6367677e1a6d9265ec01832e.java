import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    /**Check if the named logger exists. If so return its reference, otherwise returns null.**/
	public Logger exists(String name){
		if (name == null) {
			return null;
		}
		Logger l = loggers.get(name);
		if (l != null && !l.isClosed()) {
			return l;
		} else {
			return null;
		}
	}
}