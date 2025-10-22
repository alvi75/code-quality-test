import java.util.*;

public class Translation67 {
    public int get(int i) {
    if (count <= i) {
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }
    return entries[i];
}
}