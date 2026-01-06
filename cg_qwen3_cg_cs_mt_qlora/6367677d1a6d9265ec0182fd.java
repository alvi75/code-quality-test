import java.util.*;

public class Generated_6367677d1a6d9265ec0182fd {
    public static boolean toBoolean(String value,boolean dEfault){
		if(value==null) return dEfault;
		value=value.trim().toLowerCase();
		if("true".equals(value)) return true;
		else if("false".equals(value)) return false;
		else return dEfault;
	}
}