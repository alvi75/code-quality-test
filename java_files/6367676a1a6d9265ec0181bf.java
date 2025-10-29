import java.util.*;

public class Generated_6367676a1a6d9265ec0181bf {
    /**Check whether an obj variable is of the String type.**/
    public static Object quoteIfString(Object obj){
        if(obj == null || obj instanceof String)
            return obj;
        else
            return "\"" + obj.toString() + "\"";
    }
}