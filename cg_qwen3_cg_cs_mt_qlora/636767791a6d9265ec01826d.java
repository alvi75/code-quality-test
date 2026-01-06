import java.util.*;

public class Generated_636767791a6d9265ec01826d {
    public static String findAndSubst(String key,Properties props){
        try{
            return props.getProperty(key).replaceAll("\\$\\{([^}]+)\\}", m -> {
                String val = props.getProperty(m.group(1));
                if(val == null)
                    throw new RuntimeException("No such property: "+m.group(1));
                return val;
            });
        }catch(Exception e){
            return props.getProperty(key);
        }
    }
}