import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
		if(array==null || array.length==0)
			throw new IllegalArgumentException("The length of the array can't be 0.");
		String[] result=new String[array.length];
		for(int i=0;i<array.length;i++){
			Object o=array[i];
			if(o!=null && o instanceof String)
				result[i]=(String)o;
		}
		return result;
	}
}