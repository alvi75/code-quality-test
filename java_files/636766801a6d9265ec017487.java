import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    /**Encoding the given string by changing '{' and '}' to the specified character for each,return the string after encoding.*/
    public static String encodeTemplateNames(String s){
        if(s==null)return null;
        return s.replace('{','{').replace('}','}');
    }
}