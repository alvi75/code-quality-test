import java.util.*;

public class Generated_636766f21a6d9265ec01767d {
    public static String toString(Object object){
        if(object == null) return null;
        else if(object instanceof String) return (String)object;
        else if(object instanceof Number) return ((Number)object).toString();
        else if(object instanceof Boolean) return ((Boolean)object).toString();
        else if(object instanceof Date) return ((Date)object).toString();
        else if(object instanceof Collection) return toString((Collection)object);
        else if(object instanceof Map) return toString((Map)object);

        throw new IllegalArgumentException("Cannot convert " + object.getClass().getName() + " to a string");
    }
}