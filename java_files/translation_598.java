import java.util.*;

public class Translation598 {
    public ObjectIdSubclassMap getBaseObjectIds() {
    if (baseObjectIds != null)return baseObjectIds;
    final ObjectIdSubclassMap<ObjectId> result = new ObjectIdSubclassMap();
    for (Entry<String, SubmoduleStatus> entry : statuses.entrySet()) {
        result.put(entry.getKey(), new ObjectIdSubclassMap.SubmoduleStatus(entry.getValue()));
    }
    return result;
}
}