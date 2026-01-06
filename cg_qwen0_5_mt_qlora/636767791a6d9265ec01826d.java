import java.util.*;

public class Generated_636767791a6d9265ec01826d {
    /**Find the value corresponding to key in props, then perform variable substitution on the found value. Return the substitution result, or the value in case of exception.**/
public static String findAndSubst(String key,Properties props){
        String value = props.getProperty(key);
        if(value == null) return value;
        try{
            return Substitution.substitute(value,props);
        }catch(Exception e){
            return value;
        }
    }
}