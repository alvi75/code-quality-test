import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    /**Find the last index of the searchStr in str, and return INDEXNOTFOUND if str is empty.*/
    public static int lastIndexOf(String str,String searchStr){
        if(str==null || searchStr==null) return INDEXNOTFOUND;
        if(searchStr.length()==0) return INDEXNOTFOUND;
        int searchLength=searchStr.length();
        int strLength=str.length();
        for(int i=strLength-searchLength;i>=0;i--){
            if(str.regionMatches(true,i,searchStr,0,searchLength)){
                return i;
            }
        }
        return INDEXNOTFOUND;
    }
}