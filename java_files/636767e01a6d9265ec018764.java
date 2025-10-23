import java.util.*;

public class Generated_636767e01a6d9265ec018764 {
    /**
 * Convert process properties to the JsonObject.
 **/
private JsonObject convertProperties(List<KeyStringValuePair> properties) {
        JsonObject propertiesJson = new JsonObject();
        for (KeyStringValuePair property : properties) {
            propertiesJson.add(property.getKey(), property.getValue());
        }
        return propertiesJson;
    }
}