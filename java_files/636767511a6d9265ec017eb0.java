import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    /**Return the number of non-zero entries of a row.**/
    public int nonZeros(int row) {
        int count = 0;
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] != null && !rows[i].isEmpty()) {
                count += rows[i].nonZeros();
            }
        }
        return count;
    }
}