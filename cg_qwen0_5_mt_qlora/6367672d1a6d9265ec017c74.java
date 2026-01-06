import java.util.*;

public class Generated_6367672d1a6d9265ec017c74 {
    /**Remove a value from the values if the map keys contains the val. Returns true if actually removed, and false otherwise.**/
public boolean remove(int val){
        for (int i = 0; i < values.length; i++) {
            if (values[i] == val) {
                values[i] = null;
                return true;
            }
        }
        return false;
    }
}