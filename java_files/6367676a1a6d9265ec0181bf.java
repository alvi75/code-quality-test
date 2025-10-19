import java.util.*;

public class Generated_6367676a1a6d9265ec0181bf {
    public static Object quoteIfString(Object obj){
        if (obj == null) {
            return obj;
        }
        Class<?> clazz = obj.getClass();
        if (clazz.isPrimitive()) {
            return obj;
        } else if (clazz.equals(String.class)) {
            return "\"" + ((String) obj).trim() + "\"";
        } else {
            return obj;
        }
    }
}