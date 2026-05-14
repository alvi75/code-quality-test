import java.util.*;

public class Translation696 {
    1 public boolean remove(Object o) {
    2 synchronized (mutex) {
        3 int oldSize = size();
        4 removeElement(o);
        5 return size() != oldSize;
        6 }
    }
}