import java.util.*;

public class Generated_6367677d1a6d9265ec0182fd {
    public static boolean toBoolean(String value,boolean dEfault){
		if(value==null)return dEfault;
		value=value.trim();
		if("true".equalsIgnoreCase(value))return true;
		else if("false".equalsIgnoreCase(value))return false;
		else return dEfault;
	}
}