import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    private static Object copyArrayGrow1(final Object array,
                                       final Class<?> newArrayComponentType){
    if(array==null)
      return Array.newInstance(newArrayComponentType, 0);
    else{
      int len = Array.getLength(array);
      Object result = Array.newInstance(newArrayComponentType, len+1);
      System.arraycopy(array, 0, result, 0, len);
      Array.set(result, len, null);
      return result;
    }
  }
}