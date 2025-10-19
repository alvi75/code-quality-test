import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    /**Return the number of non-zero entries of a row.**/
    public int nonZeros(int row)
    {
        int i, n = 0;
        for (i = nz_rows [row]; i < nz_rows [row+1]; i++)
            if (values [i] != 0) n++;
        return n;
    }
}