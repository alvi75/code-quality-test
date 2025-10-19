import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject){
        Map<String,Object> content = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if(entry.getValue().isJsonPrimitive()){
                content.put(entry.getKey(),entry.getValue().getAsString());
            }else if(entry.getValue().isJsonObject()){
                content.put(entry.getKey(),buildContent(entry.getValue().getAsJsonObject()));
            }
        }
        return content;
    }
}