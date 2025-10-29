import java.util.*;

public class Generated_636767021a6d9265ec0178bc {
    public static int indexOf(String str,String searchStr){
        if(str==null || searchStr==null) return -1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==searchStr.charAt(0)){
                boolean found=false;
                for(int j=1;j<searchStr.length();j++){
                    if(str.charAt(i+j)!=searchStr.charAt(j)){
                        found=true;
                        break;
                    }
                }
                if(!found) return i;
            }
        }
        return -1;
    }
}