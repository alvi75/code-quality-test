import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    /**Return the number of non-zero entries of a row.*/
    public int nonZeros(int row){
        int n = 0;
        for (int i=0; i<col.length; i++){
            if (col[i] != 0) n++;
        }
        return n;
    }
}