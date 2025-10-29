import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
		if(array.length==0)throw new IllegalArgumentException("The array must be not empty");
		String[] result=new String[array.length];
		for(int i=0;i<array.length;i++){
			result[i]=toNoNullString(array[i]);
		}
		return result;
	}
}