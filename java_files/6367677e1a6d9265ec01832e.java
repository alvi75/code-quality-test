import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    public Logger exists(String name) {
        if (name == null || name.length() < 1)
            return null;
        String lowerName = name.toLowerCase();
        for (int i=0; i<loggers.size(); i++) {
            Logger l = loggers.get(i);
            if (l.getName().toLowerCase().equals(lowerName))
                return l;
        }
        return null;
    }
}