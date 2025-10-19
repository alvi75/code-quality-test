import java.util.*;

public class Generated_6367677d1a6d9265ec0182fd {
    public static boolean toBoolean(String value,boolean dEfault){
		value=StringHelper.trim(value);
		if (value==null || value.length()==0)return dEfault;
		return Boolean.valueOf(value.toLowerCase());
	}
}