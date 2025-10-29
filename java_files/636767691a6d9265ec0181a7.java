import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    public static String trimLeadingCharacter(String str,char leadingCharacter){
        if(str==null)return null;
        int start=0;
        while(start<str.length()&&str.charAt(start)==leadingCharacter)start++;
        return str.substring(start);
    }
}