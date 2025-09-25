import java.util.*;

public class Translation520 {
    public static int numNonnull(Object[] data) {
    int n = 0;
    if(data==null) return n;
    for(int i=0;
    i<data.length;
    i++) {
        Object o = data[i];
        if(o!=null) {
            n++;
        }
    }
    return n;
}
}