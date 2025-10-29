import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    /**Remove the appender by the given name from the list of appenders.**/
    public void removeAppender(String name) {
        for (int i = 0; i < _appenders.size(); i++) {
            Appender appender = _appenders.get(i);
            if (appender.getName().equals(name)) {
                _appenders.remove(i);
                return;
            }
        }
    }
}