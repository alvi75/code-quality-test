import java.util.*;

public class Generated_636766fe1a6d9265ec017834 {
    public static String sessionId(){
        if (session == null) {
            return "";
        }
        try{
            return session.getId();
        }catch(Exception e){
            return "";
        }
    }
}