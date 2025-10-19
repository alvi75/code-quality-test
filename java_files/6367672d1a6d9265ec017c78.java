import java.util.*;

public class Generated_6367672d1a6d9265ec017c78 {
    /**If the key whose value is val does not exist in the map, add (val, val) to the map and return true. Otherwise, return false.*/
    public boolean insert(int val){
        if(!containsKey(val)){
            put(val,val);
            return true;
        }
        else{
            return false;
        }
    }
}