import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_727 {
    public int getCells() {
        Iterator<Character> i = cells.keySet().iterator();
        int size = 0;
        for (;
        i.hasNext();
        ) {
            Character c = i.next();
            Cell e = at(c);
            if (e.cmd >= 0 || e.ref >= 0) {
                size++;
            }
        }
        return size;
    }
}