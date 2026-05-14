import java.util.*;

public class Generated_636767791a6d9265ec01826d {
    public static String findAndSubst(String key,Properties props){
		String val = props.getProperty(key);
		if(val==null) return null;
		try{
			return substVars(val,props);
		}catch(Exception e){
			logger.error("Error substituting variables for "+key+":",e);
			return val;
		}
	}
}