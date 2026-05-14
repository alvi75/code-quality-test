import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    private Map<String,Object> buildContent(JsonObject jsonObject){
        HashMap<String, Object> map = new HashMap<>();
        Set<Map.Entry<String, JsonElement>> entries = jsonObject.entrySet();
        for(Map.Entry<String,JsonElement> entry : entries){
            String key = entry.getKey();
            JsonElement jsonValue = entry.getValue();

            if(jsonValue.isJsonObject()){
                JsonObject nestedObject = (JsonObject)jsonValue;
                Class<?> typeClass = getTargetType(nestedObject);
                if(typeClass != null)
                    map.put(key, stringToObj(nestedObject.toString(),typeClass));
                else{
                    logger.warn("Nested object is not a simple type");
                    return null;
                }
            }else if(jsonValue.isJsonArray()){
                JsonArray array = (JsonArray)jsonValue;
                TypeToken<?> elementType = elementType(array.get(0).toString());
                List<Object> list = new ArrayList<>();
                Iterator<JsonElement> iterator = array.iterator();
                while(iterator.hasNext()){
                    JsonElement element = iterator.next();
                    if(element.isJsonObject()){
                        //TODO: handle nested objects.
                        continue;
                    }
                    list.add(stringToObj(element.toString(),elementType.getType()));
                }

                map.put(key,list);
            }else {
                map.put(key,jsonValue.toString());
            }
        }
        return map;
    }
}