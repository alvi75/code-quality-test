import java.util.*;

public class Generated_6367674a1a6d9265ec017dab {
    public int compare(Double o1,Double o2){
        if(o1 == null && o2 == null) return 0;
        if(o1 == null) return -1;
        if(o2 == null) return 1;

        double d = Math.abs(o1-o2);
        if(d < epsilon) return 0;
        else return (d > 0)?(o1 > o2?1:(o1==o2?-1:0)):-1;
    }
}