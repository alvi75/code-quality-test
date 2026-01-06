import java.util.*;

public class Translation67 {
    public final int get(int i) {
    if (count <= i) {
        throw new IndexOutOfBoundsException();
    }
    return entries[i];
}
}