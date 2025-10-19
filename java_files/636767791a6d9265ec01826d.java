import java.util.*;

public class Generated_636767791a6d9265ec01826d {
    public static String findAndSubst(String key,Properties props){
		String val = null;
		try{
			val = subst(props.getProperty(key));
		}catch(Exception e){
			e.printStackTrace();
		}
		return val;
	}
}