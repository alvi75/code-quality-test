import java.util.*;

public class Translationtranslation_502 {
    public Iterator<E> iterator() {
        Object[] snapshot = elements;
        return new CowIterator<E>(snapshot, 0, snapshot.length);
    }
}