import java.util.*;

public class Generated_636767e01a6d9265ec018764 {
    /**Convert process properties to the JsonObject.
 * @param properties list of key-value pairs
 * @return JsonObject representation of the properties
 */
private JsonObject convertProperties(List<KeyStringValuePair> properties) {
        JsonObject result = new JsonObject();
        for (KeyStringValuePair property : properties) {
            if (!property.getValue().isEmpty()) {
                result.put(property.getKey(), property.getValue());
            }
        }
        return result;
    }
}