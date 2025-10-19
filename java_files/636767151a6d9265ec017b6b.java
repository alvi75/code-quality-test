import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
		if(str == null || prefix == null){
			return false;
		}
		if(ignoreCase && (str.equalsIgnoreCase(prefix))){
			return true;
		}
		if(!ignoreCase && (str.equals(prefix))){
			return true;
		}
		return false;
	}
}