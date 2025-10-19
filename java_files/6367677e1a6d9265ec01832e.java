import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    public Logger exists(String name){
        try{
            LogManager.getLogManager().getLogger(name);
            return LogManager.getLogger(name);
        }catch (Exception e){
            return null;
        }
    }
}