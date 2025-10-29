import java.util.*;

public class Generated_636766ff1a6d9265ec01783b {
    /**Get a substring from the specified String avoiding exceptions.**/
    public static String sub(String str,int start,int end){
        try {
            return str.substring(start,end);
        } catch (Exception e) {
            return null;
        }
    }
}