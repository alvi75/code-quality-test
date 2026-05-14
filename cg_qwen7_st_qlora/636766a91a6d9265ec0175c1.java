import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    private void enlarge(final int size){
		final int newSize = (int) Math.ceil(size * 1.5);
		final double[] newdata = new double[newSize];
		System.arraycopy(data,0,newdata,0,data.length);
		data = newdata;
	}
}