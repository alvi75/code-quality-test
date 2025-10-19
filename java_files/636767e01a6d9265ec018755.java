import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    /**
 * Put the "content" from the  jsonObject to the content.
 **/
private Map<String,Object> buildContent(JsonObject jsonObject){
        if(jsonObject == null || jsonObject.size() == 0) return null;
        Map<String,Object> content = new HashMap<>();
        for(Map.Entry<String,JsonElement> entry : jsonObject.entrySet()){
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if(value.isJsonObject()) {
                content.put(key,buildContent(value.getAsJsonObject()));
            }else if(value.isJsonArray()) {
                content.put(key,buildArray(value.getAsJsonArray()));
            }else{
                content.put(key,value.getAsString());
            }
        }
        return content;
    }
}