import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
        if(str==null || searchStr==null) return INDEXNOTFOUND;
        if(searchStr.length()==0) return INDEXNOTFOUND;
        int index = str.lastIndexOf(searchStr);
        if(index==-1) return INDEXNOTFOUND;
        else return index;
    }
}