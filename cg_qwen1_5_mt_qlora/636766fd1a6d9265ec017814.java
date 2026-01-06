import java.util.*;

public class Generated_636766fd1a6d9265ec017814 {
    /**Given two arrays with the given length count,return true if the array a is equal to array b,otherwise return false.*/
	public static boolean arrayequals(byte[] a,byte[] b,int count){
		if(a.length!=count || b.length!=count) {
			return false;
		}
		
		for(int i=0;i<count;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		
		return true;
	}
}