import java.util.*;

public class Translation717 {
    public static final int idealByteArraySize(int need) {
    for (int x = 4;
    x < 32;
    x++) {
        if (need <= (1<<x)-12) {
            return (1<<x)-12;
        }
    }
    return need;
}
}