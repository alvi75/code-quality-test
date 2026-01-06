import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    /**
 * Return the servlet session id**
 */
public static String sessionId(){
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session = (HttpSession) request.getSession(false);
        if(session == null){
            return null;
        }
        return session.getId();
    }
}