import java.util.*;

public class Generated_636767431a6d9265ec017c8d {
    /**Calculate the floor of the logarithmic value of the given value in base 2.
@see #computeBinaryLog(double)
@param n The number to calculate the log for.
@return The floor of the log.
*/
private int computeBinaryLog(int n){
int result = 0;
while(n > 1){
n >>= 1;
result++;
}
return result;
}
}