import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
		final int oldLength = Array.getLength(array);
		final int newLength = oldLength + 1;
		final Object newArray = Array.newInstance(newArrayComponentType,newLength);
		System.arraycopy(array,0,newArray,0,oldLength);
		return newArray;
	}
}