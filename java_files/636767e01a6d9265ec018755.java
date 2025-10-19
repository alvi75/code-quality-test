import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject){
        if(jsonObject==null) return null;
        Iterator<Map.Entry<String, JsonElement>> entries = jsonObject.entrySet().iterator();
        Map<String,Object> map = new HashMap<>();
        while (entries.hasNext()) {
            Map.Entry<String, JsonElement> entry = entries.next();
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            Object objValue = getObjFromJson(key,value);
            map.put(key,objValue);
        }
        return map;
    }
}