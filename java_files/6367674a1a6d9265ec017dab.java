import java.util.*;

public class Generated_6367674a1a6d9265ec017dab {
    @Override
    public int compare(Double o1,Double o2){
        if(o1==null || o2==null)
            return (o1==null)?-1:1;
        double d = Math.abs(o1-o2);
        return (d<epsilon)?0:d;
    }
}