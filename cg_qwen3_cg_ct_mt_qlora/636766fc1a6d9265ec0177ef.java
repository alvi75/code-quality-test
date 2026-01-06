import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
		if(array.length==0)throw new IllegalArgumentException("The array must have at least one element");
		String[] result=new String[array.length];
		int i=0;
		for(Object o:array){
			if(o!=null){
				result[i]=o.toString();
				i++;
			}
		}
		return result;
	}
}