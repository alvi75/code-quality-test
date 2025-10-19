import java.util.*;

public class Generated_6367677d1a6d9265ec0182fd {
    public static boolean toBoolean(String value,boolean dEfault){
		if(value==null)return dEfault;
		value=value.trim().toLowerCase();
		if(value.equals("true"))return true;
		else if(value.equals("false"))return false;
		return dEfault;
	}
}