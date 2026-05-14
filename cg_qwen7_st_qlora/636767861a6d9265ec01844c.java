import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    public void removeAppender(String name){
        if (name == null) {
            throw new IllegalArgumentException("The name argument cannot be null.");
        }
        for(int i=0;i<appenders.size();i++){
            Appender appender = (Appender)appenders.get(i);
            if(appender.getName().equals(name)){
                removeAppender(appender);
                return;
            }
        }
    }
}