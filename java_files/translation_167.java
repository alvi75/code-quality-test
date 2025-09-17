import java.util.*;

public class Translationtranslation_167 {
    public boolean remove(Object object) {
        synchronized (mutex) {
            return delegate().remove(object);
        }
    }
}