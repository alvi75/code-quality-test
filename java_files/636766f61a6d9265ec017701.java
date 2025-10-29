import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
        if(str==null || searchStr==null)return -1;
        int len = str.length();
        int index = len-1;
        for(int i=len-1;i>=0;--i){
            if(str.charAt(i)==searchStr.charAt(0)){
                while(index>i && str.charAt(index)!=searchStr.charAt(0)){
                    --index;
                }
                if(index<=i)break;
                else return index+1;
            }
        }
        return -1;
    }
}