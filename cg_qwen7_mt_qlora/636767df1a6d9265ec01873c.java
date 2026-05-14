import java.util.*;

public class Generated_636767df1a6d9265ec01873c {
    /**Return the id by concatenating the point and the entity id with id connector.*/
    public String id(String entityId){
        if (entityId == null) {
            return this.id;
        }
        else{
            return this.id + ID_CONNECTOR + entityId;
        }
    }
}