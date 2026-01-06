import java.util.*;

public class Generated_636767791a6d9265ec01826d {
    public static String findAndSubst(String key,Properties props){
		String val = props.getProperty(key);
		if(val==null) return null;
		try{
			return subst(val);
		}catch(Exception e){
			log.error("Error performing variable substitution",e);
			return val;
		}
	}
}