import java.util.*;

public class Generated_636767df1a6d9265ec01873c {
    public String id(String entityId){
        if (idConnector == null) {
            return entityId;
        }
        else{
            return idConnector + entityId;
        }
    }
}