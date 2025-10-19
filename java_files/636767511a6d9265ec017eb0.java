import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    public int nonZeros(int row){
        int nz = 0;
        for (int j=rows[row];j<rows[row+1];j++){
            if (data[j]!=0) nz++;
        }
        return nz;
    }
}