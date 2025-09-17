import java.util.*;

public class Translationtranslation_62 {
    public boolean remove(Object object) {
        synchronized (mutex) {
            return delegate().remove(object);
        }
    }
}