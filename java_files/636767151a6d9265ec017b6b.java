import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
		if(str == null && prefix != null) return false;
		if(prefix == null && str != null) return false;
		if(str == null || prefix == null) return true;
		return str.startsWith(prefix,ignoreCase);
	}
}