import java.util.*;

public class Generated_636766ff1a6d9265ec01783b {
    public static String sub(String str,int start,int end){
        if(str==null || str.length()==0)
            return "";
        int len=str.length();
        if(start<0)
            start=0;
        else if(start>len)
            start=len;
        if(end>str.length())
            end=str.length();
        else if(end<start)
            end=start;
        return str.substring(start,end);
    }
}