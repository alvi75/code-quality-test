import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key,Long value){
        if(accumulated.containsKey(key)){
            accumulated.put(key,accumulated.get(key)+value);
        }else{
            accumulated.put(key,value);
        }
    }
}