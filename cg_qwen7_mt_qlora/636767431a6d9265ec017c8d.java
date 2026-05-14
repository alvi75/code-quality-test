import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    /**Calculate the floor of the logarithmic value of the given value in base 2.*/
private int computeBinaryLog(int n){
		if(n < 0) throw new IllegalArgumentException("Cannot calculate log for negative numbers");
		int result = -1;
		while (n > 0){
			n >>>= 1;
			result++;
		}
		return result;
	}
}