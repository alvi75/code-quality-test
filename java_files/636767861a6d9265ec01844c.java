import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    public void removeAppender(String name){
		if(name==null || name.length()==0) return;
		for(Appender appender: this.appenders){
			if(appender.getName().equals(name)){
				this.appenders.remove(appender);
				break;
			}
		}
	}
}