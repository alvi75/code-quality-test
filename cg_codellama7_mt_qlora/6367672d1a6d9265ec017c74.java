import java.util.*;

public class Generated_6367672d1a6d9265ec017c74 {
    public boolean remove(int val) {
        int index = find(val);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }
}