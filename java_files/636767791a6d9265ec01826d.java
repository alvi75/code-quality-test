import java.util.*;

public class Generated_636767791a6d9265ec01826d {
    public static String findAndSubst(String key,Properties props){
        String value = props.getProperty(key);
        if(value == null) return value;
        try{
            return Substitution.substitute(value,key,props);
        }catch(Exception e){
            return value;
        }
    }
}