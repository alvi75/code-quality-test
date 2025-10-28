import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
        if(str == null || searchStr == null) {
            throw new NullPointerException("str or searchStr can't be null");
        }
        int len = str.length();
        int pos = str.indexOf(searchStr);
        if(pos != -1 && pos < len) {
            for(int i = pos + 1; i < len; i++) {
                if(str.charAt(i) != searchStr.charAt(0)) {
                    break;
                }
            }
        }
        return pos;
    }
}