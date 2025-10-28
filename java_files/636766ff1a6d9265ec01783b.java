import java.util.*;

public class Generated_636766ff1a6d9265ec01783b {
    public static String sub(String str,int start,int end){
        if(start<0 || end>str.length() || start>end)
            return "";
        else
            return str.substring(start,end);
    }
}