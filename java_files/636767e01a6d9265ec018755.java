import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject){
        Map<String,Object> map = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            if(key.equals("content")){
                JsonObject contentJson = entry.getValue().getAsJsonObject();
                map.putAll(buildContent(contentJson));
            }else{
                map.put(entry.getKey(),entry.getValue());
            }
        }
        return map;
    }
}