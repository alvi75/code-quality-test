import java.util.*;

public class Generated_6367674a1a6d9265ec017dab {
    @Override
    public int compare(Double o1,Double o2){
        if(Math.abs(o1-o2) < epsilon)
            return 0;
        else
            return (o1 > o2 ? 1 : -1);
    }
}