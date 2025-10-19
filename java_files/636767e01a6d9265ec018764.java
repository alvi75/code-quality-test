import java.util.*;

public class Generated_636767e01a6d9265ec018764 {
    /**Convert process properties to the JsonObject.**/
    private JsonObject convertProperties(List<KeyStringValuePair> properties){
        JsonObject result = new JsonObject();
        for(KeyStringValuePair property : properties) {
            if(property.getKey() != null && !property.getKey().isEmpty()) {
                result.addProperty(property.getKey(), property.getValue());
            }
        }
        return result;
    }
}