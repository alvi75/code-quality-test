import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    /**Put the "content" from the  jsonObject to the content.*/
    private Map<String,Object> buildContent(JsonObject jsonObject){
        Map<String, Object> content = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if (!entry.getKey().equals("content")) {
                continue;
            }
            JsonObject contentJson = entry.getValue().getAsJsonObject();
            for (Map.Entry<String, JsonElement> contentEntry : contentJson.entrySet()) {
                String key = contentEntry.getKey();
                JsonElement value = contentEntry.getValue();

                if (value.isJsonPrimitive()) {
                    content.put(key, value.getAsString());
                } else if (value.isJsonArray()) {
                    List<Object> list = new ArrayList<>();
                    for (JsonElement element : value.getAsJsonArray()) {
                        list.add(element.getAsString());
                    }
                    content.put(key, list);
                } else if (value.isJsonObject()) {
                    content.put(key, buildContent(value.getAsJsonObject()));
                }
            }
        }

        return content;
    }
}