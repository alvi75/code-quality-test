import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    private int computeBinaryLog(int n){
		int log = -1;
		while(n > 0){
			n >>>= 1;
			log++;
		}
		return log;
	}
}