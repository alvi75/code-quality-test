import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
        if(str==null || searchStr==null) return -1;
        if(searchStr.length()==0) return 0;

        int len=str.length();
        int slen=searchStr.length();

        for(int i=len-slen;i>=0;i--){
            if(str.regionMatches(true,i,slen,searchStr)) return i;
        }
        return -1;
    }
}