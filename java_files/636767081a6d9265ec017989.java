import java.util.*;

public class Generated_636767081a6d9265ec017989 {
    /**Convert the given Boolean array to primitives. Return ArrayUtils.EMPTY_BOOLEAN_ARRAY for an empty array, return null for null array.*/
    if(array==null) return null;
    final int len=array.length;
    if(len==0) return EMPTY_BOOLEAN_ARRAY;
    final boolean[] result=new boolean[len];
    for(int i=0;i<len;++i){
      result[i]=array[i];
    }
    return result;
  }
}