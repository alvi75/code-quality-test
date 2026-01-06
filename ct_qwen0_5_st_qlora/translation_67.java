import java.util.*;

public class Translation67 {
    public int get(int i) {
    if (count <= i) {
        throw createIndexOutOfRange(i);
    }
    return entries[i];
}
}