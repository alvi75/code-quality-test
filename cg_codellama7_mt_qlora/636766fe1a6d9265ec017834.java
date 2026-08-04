import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    public static String sessionId() {
        HttpServletRequest request = getRequest();
        if (request != null) {
            return request.getSession().getId();
        }
        return null;
    }
}