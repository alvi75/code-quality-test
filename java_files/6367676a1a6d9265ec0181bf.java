import java.util.*;

public class Generated_6367676a1a6d9265ec0181bf {
    public static Object quoteIfString(Object obj) {
        if (obj == null || obj instanceof String)
            return obj;
        else
            return "\"" + obj.toString() + "\"";
    }
}