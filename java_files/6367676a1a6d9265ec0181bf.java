import java.util.*;

public class Generated_6367676a1a6d9265ec0181bf {
    public static Object quoteIfString(Object obj){
		if(obj==null) return "\"\"";
		else if(obj instanceof String || obj instanceof Character) return '"' + (String)obj + '"';
		return obj;
	}
}