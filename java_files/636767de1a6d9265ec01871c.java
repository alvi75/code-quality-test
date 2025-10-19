import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key,Long value){
        if(!this.values.containsKey(key)){
            this.values.put(key,new HashMap<>());
        }
        this.values.get(key).put("value",this.values.get(key).get("value") + value);
    }
}