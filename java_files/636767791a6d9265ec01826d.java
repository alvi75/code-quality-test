import java.util.*;

public class Generated_636767791a6d9265ec01826d {
    public static String findAndSubst(String key,Properties props){
		String val = props.getProperty(key);
		if(val == null) return val;
		try {
			return Substitutor.substitute(val,key,props);
		} catch (Exception e) {
			return val;
		}
	}
}