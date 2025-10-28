import java.util.*;

public class Generated_636767021a6d9265ec0178bc {
    /**
 * Return the first index of the searchStr in the given string.
 */
public static int indexOf(String str,String searchStr){
        if(str==null || searchStr==null) return -1;
        int i = 0;
        while((i=str.indexOf(searchStr,i))!=-1)
            ++i;
        return i;
    }
}