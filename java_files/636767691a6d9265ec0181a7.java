import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    /**
     * Trim all the characters which are equal to the given character and appear at the beginning of the given string,and return the trimmed string.
     */
    public static String trimLeadingCharacter(String str,char leadingCharacter){
        if(str==null)return null;
        int len=str.length();
        while(len>0&&str.charAt(0)==leadingCharacter)len--;
        return (len==0)?null:str.substring(0,len);
    }
}