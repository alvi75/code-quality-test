import java.util.*;

public class Generated_636767e01a6d9265ec018764 {
    private JsonObject convertProperties(List<KeyStringValuePair> properties){
        JsonObject json = new JsonObject();
        for (KeyStringValuePair property : properties) {
            json.addProperty(property.getKey(), property.getValue());
        }
        return json;
    }
}