import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    /**Remove the appender by the given name from the list of appenders.**/
    public void removeAppender(String name){
        for (int i = 0; i < appenders.size(); i++) {
            if (appenders.get(i).getName().equals(name)) {
                appenders.remove(i);
                break;
            }
        }
    }
}