import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    public void removeAppender(String name){
        if (name == null) {
            return;
        }
        for(int i = 0; i < appenders.size(); i++){
            Appender a = (Appender)appenders.get(i);
            if(a.getName().equals(name)){
                appenders.remove(i);
                break;
            }
        }
    }
}