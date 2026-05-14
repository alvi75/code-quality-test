import java.util.*;

public class Generated_636767511a6d9265ec017eb0 {
    public int nonZeros(int row){
		int nz = 0;
		for (int i=0; i<rows[row]; i++){
			if (data[i] != 0) nz++;
		}
		return nz;
	}
}