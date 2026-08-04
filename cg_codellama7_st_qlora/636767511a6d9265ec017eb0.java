import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    public int nonZeros(int row){
        int n = 0;
        for(int j = 0; j < nCols; j++){
            if(get(row, j) != 0) n++;
        }
        return n;
    }
}