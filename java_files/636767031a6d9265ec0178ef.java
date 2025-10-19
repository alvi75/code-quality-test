import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
		final int len=array.length;
		final Object newArray=Array.newInstance(newArrayComponentType,len+1);
		System.arraycopy(array,0,newArray,0,len);
		return newArray;
	}
}