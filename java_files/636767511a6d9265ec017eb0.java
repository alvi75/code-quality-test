import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    public int nonZeros(int row) {
        if (row >= numRows)
            throw new IllegalArgumentException("Row index out of range");
        return (int) Math.max(0, row - firstNonZero[row]);
    }
}