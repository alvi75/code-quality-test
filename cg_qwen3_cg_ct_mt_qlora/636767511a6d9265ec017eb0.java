import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    /**Return the number of non-zero entries of a row.*/
    public int nonZeros(int row){
        int count = 0;
        for (int i=0; i<rowSize[row]; i++) {
            if (values[row][i] != 0) count++;
        }
        return count;
    }
}