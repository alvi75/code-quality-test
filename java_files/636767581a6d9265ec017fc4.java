import java.util.*;

public class Generated_636767581a6d9265ec017fc4 {
    /**Calculate the factorial of the given number.*/
    public static long factorial(int n){
        if(n<0) throw new IllegalArgumentException("n must be >= 0");
        if(n==0 || n==1) return 1;
        else{
            long result = 1;
            for(int i=n; i>0; i--) result *= i;
            return result;
        }
    }
}