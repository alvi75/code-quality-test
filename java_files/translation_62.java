import java.util.*;

public class Translationtranslation_62 {
    public boolean remove(Object o) {
        synchronized (mutex) {
            return delegate().remove(o);
        }
    }
}