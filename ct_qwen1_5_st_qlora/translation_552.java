import java.util.*;

public class Translation552 {
    @Override public int lastIndexOf(String subString, int start) {
    synchronized (mutex) {
        return super.lastIndexOf(subString, start);
    }
}
}