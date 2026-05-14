import java.util.*;

public class Generated_636767e01a6d9265ec018764 {
    private JsonObject convertProperties(List<KeyStringValuePair> properties) {
        JsonObjectBuilder factory = Json.createObjectBuilder();
        for (KeyStringValuePair prop : properties)
            if (!prop.getKey().equals("type"))
                factory.add(prop.getKey(), prop.getValue());
        return factory.build();
    }
}