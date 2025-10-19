import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject){
        if(jsonObject!=null && jsonObject.get("content") != null) {
            return jsonObject.entrySet().stream()
                    .filter(e -> e.getValue() instanceof JsonObject)
                    .map(e -> {return new SimpleImmutableEntry<>(e.getKey(), (JsonObject)e.getValue());})
                    .collect(Collectors.toMap(ImmutableEntry::getKey, ImmutableEntry::getValue));
        }
        else{
            return Collections.emptyMap();
        }
    }
}