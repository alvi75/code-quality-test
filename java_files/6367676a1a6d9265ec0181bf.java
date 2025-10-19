import java.util.*;

public class Generated_6367676a1a6d9265ec0181bf {
    /**
 * Check whether an obj variable is of the String type.
**/
public static Object quoteIfString(Object obj){
	if(obj instanceof String)
		return "'" + obj.toString() + "'";
	else
		return obj;
}
}