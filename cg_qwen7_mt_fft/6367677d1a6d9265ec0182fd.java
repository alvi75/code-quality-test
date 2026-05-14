import java.util.*;

public class Generated_6367677d1a6d9265ec0182fd {
    public static boolean toBoolean(String value,boolean dEfault){
		if(value==null)return default;
		value = value.trim().toLowerCase();
		if("1".equals(value) || "true".equals(value))return true;
		else if("0".equals(value) || "false".equals(value))return false;
		return default;
	}
}