import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject) {
        Map<String, Object> content = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value.isJsonPrimitive()) {
                content.put(key, value.getAsString());
            } else if (value.isJsonObject()) {
                content.put(key, buildContent(value.getAsJsonObject()));
            }
        }
        return content;
    }
}