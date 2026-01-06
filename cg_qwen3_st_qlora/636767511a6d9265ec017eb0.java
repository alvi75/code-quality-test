import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    /**
 * Return the number of non-zero entries of a row.
 **/
 public int nonZeros(int row){
    if(row < 0 || row >= numRows) throw new IllegalArgumentException("row out of bounds");
    return (int)Arrays.stream(data[row]).filter(x->x!=0).count();
  }
}