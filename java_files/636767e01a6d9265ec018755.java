import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject){
        Map<String, Object> content = new HashMap<>();
        if(jsonObject != null && jsonObject.has("content")){
            content.put("content", jsonObject.get("content"));
        }
        return content;
    }
}