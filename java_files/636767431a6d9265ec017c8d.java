import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    private int computeBinaryLog(int n){
		int log = 0;
		while(n > 1){
			n >>= 1;
			log++;
		}
		return log;
	}
}