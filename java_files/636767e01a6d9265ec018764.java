import java.util.*;

public class Generated_636767e01a6d9265ec018764 {
    private JsonObject convertProperties(List<KeyStringValuePair> properties){
        JsonObjectBuilder builder = Json.createObjectBuilder();
        for(KeyStringValuePair property : properties){
            builder.add(property.getKey(),property.getValue());
        }
        return builder.build();
    }
}