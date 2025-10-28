import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
        if(str==null || searchStr==null) return -1;
        if(searchStr.length()==0) return INDEXNOTFOUND;

        int len = str.length();
        for(int i=len-searchStr.length();i>=0;i--){
            boolean found=true;
            for(int j=0;j<searchStr.length();j++){
                if(str.charAt(i+j)!=searchStr.charAt(j)){
                    found=false;
                    break;
                }
            }
            if(found) return i;
        }

        return INDEXNOTFOUND;
    }
}