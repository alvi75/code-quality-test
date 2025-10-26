import java.util.*;

public class Translation696 {
    ublic boolean remove(Object o) {
    synchronized (this) {
        int oldSize = this.size;
        this.remove(o);
        return this.size != oldSize;
    }
}
}