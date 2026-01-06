import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject){
        Map<String,Object> content = new HashMap<>();
        for (Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if(entry.getValue().isJsonObject()){
                JsonObject jsonObject1 = entry.getValue().getAsJsonObject();
                content.put(entry.getKey(),buildContent(jsonObject1));
            }else{
                content.put(entry.getKey(),entry.getValue().getAsString());
            }
        }
        return content;
    }
}