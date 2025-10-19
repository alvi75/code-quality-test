import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array){
		if(array==null) return 0;
		int result=HASH_CODE_MULTIPLIER;
		for(int i=0;i<array.length;i++){
			result=HASH_CODE_MULTIPLIER*result+array[i];
		}
		return result;
	}
}