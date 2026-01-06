import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    private int computeBinaryLog(int n){
        if(n == 0) return 0;
        int log = 0;
        while((n >>= 1) != 0)
            ++log;
        return log;
    }
}