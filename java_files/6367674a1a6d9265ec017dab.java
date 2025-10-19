import java.util.*;

public class Generated_6367674a1a6d9265ec017dab {
    @Override
    public int compare(Double o1,Double o2){
        if(o1 == null && o2 != null) return -1;
        else if(o2 == null && o1 != null) return +1;
        else if(o1 == null && o2 == null) return 0;
        else {
            double diff = Math.abs(o1-o2);
            if(diff < epsilon) return 0;
            else return (int)diff;
        }
    }
}