import java.util.*;

public class Generated_6367674a1a6d9265ec017dab {
    @Override
    public int compare(Double o1,Double o2){
        if (o1 == null || o2 == null) {
            return o1 == null ? -1 : 1;
        }
        double d = o1.doubleValue() - o2.doubleValue();
        if (d < EPSILON) {
            return 0;
        } else {
            return (d > 0)? 1: -1;
        }
    }
}