import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    public static String trimLeadingCharacter(String str,char leadingCharacter){
        if(str==null) return null;
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)==leadingCharacter) continue;
            else break;
        }
        if(i==len) return "";
        else return str.substring(i);
    }
}