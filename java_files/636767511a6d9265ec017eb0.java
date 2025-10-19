import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    public int nonZeros(int row){
        int count = 0;
        for (int i = 0; i < nCols; i++) {
            if( data[row][i] != 0 ) {
                count++;
            }
        }
        return count;
    }
}