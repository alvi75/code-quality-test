import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    public static String sessionId(){
        javax.servlet.http.HttpServletRequest request = RequestUtils.current().getRequest();
        return null == request ? "" : request.getSession().getId();
    }
}