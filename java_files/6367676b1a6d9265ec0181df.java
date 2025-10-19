import java.util.*;

public class Generated_6367676b1a6d9265ec0181df {
    public static boolean startsWithIgnoreCase(String str,String prefix){
		if(str == null || prefix == null)
			return false;
		return str.toLowerCase().startsWith(prefix.toLowerCase());
	}
}