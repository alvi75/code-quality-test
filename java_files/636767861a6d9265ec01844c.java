import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    public void removeAppender(String name){
		if(name == null || name.length() == 0)
			return;
		
		for(Appender a : getAppenders()){
			if(a.getName().equals(name))
				removeAppender(a);
		}
	}
}