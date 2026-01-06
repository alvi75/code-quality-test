import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    /**
 * Put the "content" from the  jsonObject to the content.
 **/
private Map<String,Object> buildContent(JsonObject jsonObject){
        Map<String,Object> content = new HashMap<>();
        if (jsonObject.has("content")){
            content.put("content",jsonObject.get("content").toString());
        }
        return content;
    }
}