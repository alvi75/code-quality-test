import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array){
		int hashCode = 0;
		if(array!=null && array.length>0){
			for(int i=0; i<array.length;i++){
				hashCode += (int)(array[i] * MULTIPLIER);
			}
		}
		return hashCode;
	}
}