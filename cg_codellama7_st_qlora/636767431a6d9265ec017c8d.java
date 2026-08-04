import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    private int computeBinaryLog(int n){
        int result = 0;
        while(n > 0){
            n = n >>> 1;
            result++;
        }
        return result;
    }
}