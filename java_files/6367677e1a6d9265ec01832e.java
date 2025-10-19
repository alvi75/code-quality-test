import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    public Logger exists(String name){
		if(name == null) throw new IllegalArgumentException("name cannot be null");
		for(Logger l : this.loggers.values()){
			if(l.getName().equals(name)) return l;
		}
		return null;
	}
}