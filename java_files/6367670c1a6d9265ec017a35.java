import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
    if(str == null || suffix == null) return false;
    final int l = str.length();
    final int m = suffix.length();
    if(m > l) return false;
    if(ignoreCase) {
      for(int i=0;i<m;++i) {
        if(!str.regionMatches(true,i,l,m,str.charAt(i),m)) return false;
      }
    } else {
      for(int i=0;i<m;++i) {
        if(str.charAt(l-m+i) != suffix.charAt(m-i)) return false;
      }
    }
    return true;
  }
}