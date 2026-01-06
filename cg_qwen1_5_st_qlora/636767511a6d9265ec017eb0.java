import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    /**Return the number of non-zero entries of a row.**/
    public int nonZeros(int row) {
        if (row >= 0 && row < numRows()) {
            return _nzval[row].length;
        } else {
            throw new IllegalArgumentException("Row index out of bounds");
        }
    }
}