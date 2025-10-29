import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    /**Return the number of non-zero entries of a row.*/
    public int nonZeros(int row) {
        int count = 0;
        for (int i = 0; i < cols; i++) {
            if (data[row * cols + i] != 0) {
                count++;
            }
        }
        return count;
    }
}