import java.util.*;

public class Generated_636766ff1a6d9265ec01783b {
    public static String sub(String str,int start,int end){
        try{
            return str.substring(start,end);
        }catch (StringIndexOutOfBoundsException e){
            throw new RuntimeException(e);
        }
    }
}