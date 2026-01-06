import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    /**Check if the named logger exists. If so return its reference, otherwise returns null.*/
    public Logger exists(String name) {
        for (Logger l : loggers)
            if (l.name.equals(name))
                return l;
        return null;
    }
}