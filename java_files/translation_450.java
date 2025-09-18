import java.util.*;

public class Translation450 {
    public ObjectIdSubclassMap getObjectClassMap() {
    if (newObjectIds == null) {
        return null;
    }
    return new ObjectIdSubclassMap(objectIdToClassMap, newObjectIds);
}
}