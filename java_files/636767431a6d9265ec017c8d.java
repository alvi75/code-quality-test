import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    /**Calculate the floor of the logarithmic value of the given value in base 2.**/
    private int computeBinaryLog(int n){
        int log = 0;
        while((n >>= 1) != 0)
            log++;
        return log;
    }
}