import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    /**Remove the appender by the given name from the list of appenders.
@since 1.0*/
public void removeAppender(String name) {
        if (name == null || name.length() == 0)
            return;
        for (int i = 0; i < appenders.size(); i++) {
            Appender a = (Appender)appenders.get(i);
            if (a.getName().equals(name)) {
                appenders.remove(i);
                break;
            }
        }
    }
}