import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    /**Calculate the floor of the logarithmic value of the given value in base 2.*/
    private int computeBinaryLog(int n){
        if(n < 0) return -1;
        if(n == 0) return 0;

        //Find the log2 of the number.
        double log = Math.log(n)/Math.log(2);
        int result = (int)Math.floor(log);

        //If we have a fractional part, then we need to add one to get the correct answer.
        if(result != log)
            result++;

        return result;
    }
}