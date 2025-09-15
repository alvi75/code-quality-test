import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_696 {
    @Override public boolean remove(Object key) {
        if (!contains(key)) {
            return false;
        }
        removeFromBothMaps(key);
        return true;
    }
}