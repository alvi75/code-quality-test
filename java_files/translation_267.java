import java.util.*;

public class Translationtranslation_267 {
    public void add(int location, E object) {
        synchronized (mutex) {
            list.add(location, object);
        }
    }
}