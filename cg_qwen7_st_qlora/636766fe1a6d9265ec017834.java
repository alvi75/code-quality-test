import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    public static String sessionId(){
		if (request() == null) return "";
		HttpSession session = request().getSession(false);
		return session==null? "" : session.getId();
	}
}