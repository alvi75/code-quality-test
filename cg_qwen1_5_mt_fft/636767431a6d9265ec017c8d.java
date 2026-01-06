import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    private int computeBinaryLog(int n){
		if(n<=0)throw new IllegalArgumentException("n must be > 0");
		
		int log = 1;
		while((n&1)==0){
			n >>= 1;
			log++;
		}
		
		return log;
	}
}