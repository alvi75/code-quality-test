import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    public static String reverse(final String str){
        if(str == null || str.length() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        int j = sb.length()-1;
        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}