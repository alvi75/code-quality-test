import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    /**Find the last index of the searchStr in str, and return INDEXNOTFOUND if str is empty.
@see #indexOf(String, String)
@since 1.0
*/
public static int lastIndexOf(String str,String searchStr){
        if(str==null || searchStr==null) {
            throw new NullPointerException();
        }
        if(searchStr.length()==0) {
            return INDEXNOTFOUND;
        }

        int len = str.length();

        for(int i=len-1;i>=0;i--) {
            if(str.charAt(i)==searchStr.charAt(0)) {
                int j=1;
                while(j<searchStr.length() && i+j<len && str.charAt(i+j)==searchStr.charAt(j)) {
                    j++;
                }
                if(j==searchStr.length()) {
                    return i;
                }
            }
        }
        return INDEXNOTFOUND;
    }
}