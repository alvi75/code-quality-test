import java.util.*;

public class Generated_636767e01a6d9265ec018764 {
    private JsonObject convertProperties(List<KeyStringValuePair> properties){
	JsonObjectBuilder propertyBuilder = Json.createObjectBuilder();
	for(KeyStringValuePair keyStringPair : properties) {
	    propertyBuilder.add(keyStringPair.getKey(),keyStringPair.getValue());
	}
	return propertyBuilder.build();
    }
}