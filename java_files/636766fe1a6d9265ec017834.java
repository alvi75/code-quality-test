import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    public static String sessionId(){
        HttpSession session = null;
        try {
            session = ((HttpServletRequest) RequestUtils.getRequest()).getSession(false);
        } catch (Exception e) {
            return "";
        }
        if (session != null)
            return session.getId();
        else
            return "";
    }
}