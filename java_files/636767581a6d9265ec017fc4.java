import java.util.*;

public class Generated_636767581a6d9265ec017fc4 {
    public static long factorial(int n){
		if(n==0 || n==1)
			return 1;
		else{
			int fact=1;
			for(int i=2;i<=n;++i)
				fact*=i;
			return fact;
		}
	}
}