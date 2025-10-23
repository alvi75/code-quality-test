import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    public static String sessionId(){
		HttpSession session = null;
		try {
			session = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getSession(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(session != null){
			return session.getId();
		}else{
			return "";
		}
	}
}