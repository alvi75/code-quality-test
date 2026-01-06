import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject){
        Map<String,Object> content = new HashMap<>();
        for (String key : jsonObject.keySet()) {
            content.put(key, jsonObject.get(key).toString());
        }
        return content;
    }
}