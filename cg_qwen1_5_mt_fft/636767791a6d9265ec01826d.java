import java.util.*;

public class Generated_636767791a6d9265ec01826d {
    public static String findAndSubst(String key,Properties props){
		String val=find(key,props);
		if(val==null) return null;
		return subst(val,props);
	}
}