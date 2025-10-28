import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    public Logger exists(String name) {
        for (Logger l : getLoggers()) {
            if (l.getName().equals(name)) {
                return l;
            }
        }
        return null;
    }
}