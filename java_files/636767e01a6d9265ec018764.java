import java.util.*;

public class Generated_636767e01a6d9265ec018764 {
    private JsonObject convertProperties(List<KeyStringValuePair> properties){
        if(properties == null || properties.size() == 0)
            return null;
        JsonObject json = new JsonObject();
        for(KeyStringValuePair kvp:properties){
            json.add(kvp.getKey(), kvp.getValue());
        }
        return json;
    }
}