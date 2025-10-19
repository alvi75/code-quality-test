import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject){
        if(jsonObject!=null && jsonObject.has("content")){
            return jsonObject;
        }
        else{
            throw new IllegalArgumentException("The object is null or has no 'content' field.");
        }
    }
}