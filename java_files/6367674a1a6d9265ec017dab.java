import java.util.*;

public class Generated_6367674a1a6d9265ec017dab {
    @Override
    public int compare(Double o1,Double o2){
        double diff = Math.abs(o1.doubleValue() - o2.doubleValue());
        return (diff < epsilon) ? 0 : Double.compare(o1,o2);
    }
}