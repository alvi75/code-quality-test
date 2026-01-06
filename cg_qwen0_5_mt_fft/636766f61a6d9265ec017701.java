import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
        if(str==null || searchStr==null)
            throw new NullPointerException("Null argument to lastIndexOf()");
        int len=str.length();
        int pos=0;
        for(int i=len-1; i>=0; --i){
            if(str.charAt(i)==searchStr.charAt(0)){
                //if (str.substring(i+1).equals(searchStr)) {
                    //return i + 1;
                //}
                pos=i+1;
                break;
            }
        }
        return (pos==-1)? INDEX_NOT_FOUND:pos;
    }
}