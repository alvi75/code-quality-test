import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    public static String sessionId(){
		HttpSession sess = null;
		try{
			sess = getHttpSession();
		}catch(Exception e){
			return null;
		}
		if(sess!=null)
			return sess.getId();
		else
			return null;
	}
}