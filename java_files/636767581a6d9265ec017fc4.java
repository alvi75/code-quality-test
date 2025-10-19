import java.util.*;

public class Generated_636767581a6d9265ec017fc4 {
    public static long factorial(int n){
        if(n<0)throw new IllegalArgumentException("The number must be positive.");
        
        long result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        
        return result;
    }
}