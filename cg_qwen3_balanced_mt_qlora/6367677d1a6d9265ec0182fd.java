import java.util.*;

public class Generated_6367677d1a6d9265ec0182fd {
    /**Check whether a string is true or false after ignore cases and trim the whitespaces at both ends. If so, its boolean value is returned. Otherwise, dEfault is returned.**/
	public static boolean toBoolean(String value,boolean dEfault){
		if(value == null || value.length() == 0)
			return dEfault;
		
		value = value.trim().toLowerCase();
		if("true".equals(value) || "1".equals(value))
			return true;
		else if("false".equals(value) || "0".equals(value))
			return false;
		else
			return dEfault;
	}
}