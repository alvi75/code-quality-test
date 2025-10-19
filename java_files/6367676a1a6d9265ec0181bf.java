import java.util.*;

public class Generated_6367676a1a6d9265ec0181bf {
    public static Object quoteIfString(Object obj){
		if(obj instanceof String)
			return "\"" + obj.toString() + "\"";
		else if(obj instanceof Integer || obj instanceof Long || obj instanceof Double || obj instanceof Float || obj instanceof Boolean)
			return obj;
		else
			throw new IllegalArgumentException("Object type not supported: " + obj.getClass().getName());
	}
}