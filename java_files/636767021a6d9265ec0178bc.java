import java.util.*;

public class Generated_636767021a6d9265ec0178bc {
    public static int indexOf(String str,String searchStr){
        if(str == null || searchStr == null) return -1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == searchStr.charAt(0)){
                if(!searchStr.substring(1).equals(str.substring(i+1))){
                    return i;
                }
            }
        }
        return -1;
    }
}