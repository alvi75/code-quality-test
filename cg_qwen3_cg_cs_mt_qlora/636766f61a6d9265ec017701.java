import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
        if(str==null||searchStr==null)return -1;
        if(searchStr.length()==0)return -1;
        int index=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==searchStr.charAt(0)){
                boolean found=true;
                for(int j=1;j<searchStr.length();j++){
                    if(i+j>=str.length()||str.charAt(i+j)!=searchStr.charAt(j)){
                        found=false;
                        break;
                    }
                }
                if(found){
                    index=i;
                    break;
                }
            }
        }
        return index;
    }
}