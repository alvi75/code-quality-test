import java.util.*;

public class Generated_6367672d1a6d9265ec017c78 {
    public boolean insert(int val){
        if(map.containsKey(val)){
            return false;
        }
        else{
            map.put(val,val);
            return true;
        }
    }
}