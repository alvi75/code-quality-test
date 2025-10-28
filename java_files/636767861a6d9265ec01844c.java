import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    /**
     * Remove the appender by the given name from the list of appenders.
     */
    public void removeAppender(String name) {
        if (appenders.containsKey(name)) {
            appenders.remove(name);
        }
    }
}