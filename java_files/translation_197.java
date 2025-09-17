import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_197 {
    public int getCellsVal() {
        Iterator<Character> i = cells.keySet().iterator();
        int size = 0;
        for (;
        i.hasNext();
        ) {
            Character c = i.next();
            Cell e = at(c);
            if (e.cmd >= 0) {
                size++;
            }
        }
        return size;
    }
}