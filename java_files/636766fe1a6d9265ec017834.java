import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    /**
     * Return the servlet session id**/
    public static String sessionId(){
        if (session == null) {
            return "";
        }
        return session.getId();
    }
}