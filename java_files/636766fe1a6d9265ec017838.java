import java.util.*;

public class Generated_636766fe1a6d9265ec017838 {
    public static char[] toPrimitive(final Character[] array){
		if(array==null)return null;
		final int length=array.length;
		if(length==0)return ArrayUtils.EMPTY_CHAR_ARRAY;
		char[] result=new char[length];
		for(int i=0;i<length;++i)
			result[i]=array[i];
		return result;
	}
}