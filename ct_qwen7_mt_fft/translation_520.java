import java.util.*;

public class Translation520 {
    public static final int numNonnull(Object[] data) {
    int n=0;
    if(data!=null) {
        for(int i=0;
        i<data.length;
        i++) {
            if(data[i]!=null) {
                n++;
            }
        }
    }
    return n;
}
}