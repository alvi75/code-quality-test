import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
    if(str == null || prefix == null) {
      return false;
    }
    final int len = prefix.length();
    if(len > str.length()) {
      return false;
    }
    for(int i=0; i<len; i++) {
      if(ignoreCase && !Character.isUpperCase(prefix.charAt(i))) {
        continue;
      }
      if(Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(prefix.charAt(i))) {
        return false;
      }
    }
    return true;
  }
}