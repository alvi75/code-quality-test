import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    public void removeAppender(String name) {
		if (name == null || name.trim().length() == 0)
			return;
		
		for (int i = 0; i < appenderList.size(); i++) {
			Appender appender = (Appender) appenderList.get(i);
			
			if (appender.getName().equals(name)) {
				appenderList.remove(i);
				break;
			}
		}
	}
}