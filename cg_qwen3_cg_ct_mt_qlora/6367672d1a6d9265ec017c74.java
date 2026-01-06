import java.util.*;

public class Generated_6367672d1a6d9265ec017c74 {
    /**Remove a value from the values if the map keys contains the val. Returns true if actually removed, and false otherwise.*/
    public boolean remove(int val){
        int index = indexOf(val);
        if(index == -1) return false;
        else {
            remove(index);
            return true;
        }
    }
}