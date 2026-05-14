import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    /**Return the servlet session id**/
    public static String sessionId(){
        HttpServletRequest request = (HttpServletRequest)RequestContext.get().getRequest();
        HttpSession session = request.getSession(false);
        if(session != null){
            return session.getId();
        }
        return null;
    }
}