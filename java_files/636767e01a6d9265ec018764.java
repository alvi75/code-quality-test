import java.util.*;

public class Generated_636767e01a6d9265ec018764 {
    private JsonObject convertProperties(List<KeyStringValuePair> properties){
        JsonObject json = new JsonObject();
        for (KeyStringValuePair property : properties) {
            String key = property.getKey().toString();
            Object value = property.getValue();
            if (value != null && !value.toString().isEmpty()) {
                json.addProperty(key, value);
            }
        }
        return json;
    }
}