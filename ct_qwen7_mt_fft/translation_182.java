import java.util.*;

public class Translation182 {
    public static Double deviationSquare(Double[] values) {
    Double r = Double.NaN;
    if (values!=null&&values.length>=1) {
        double m=sum(values)/values.length;
        double s=0;
        for(int i=0;
        i<values.length;
        i++) {
            s+=Math.pow((values[i]-m),2);
        }
        r=(values.length==1)? 0: s/(values.length-1);
    }
    return r;
}
}