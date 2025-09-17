import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_375 {
    public List<E> subList(int start, int end) {
        synchronized (mutex) {
            return new SynchronizedRandomAccessList<E>(list.subList(start, end), mutex);
        }
    }
}