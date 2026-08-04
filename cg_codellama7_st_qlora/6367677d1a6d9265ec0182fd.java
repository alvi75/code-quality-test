import java.util.*;

public class Generated_6367677d1a6d9265ec0182fd {
    public static boolean toBoolean(String value,boolean dEfault){
		if(value==null) return dEfault;
		value=value.trim();
		if(value.equalsIgnoreCase("true")) return true;
		if(value.equalsIgnoreCase("false")) return false;
		return dEfault;
	}
}