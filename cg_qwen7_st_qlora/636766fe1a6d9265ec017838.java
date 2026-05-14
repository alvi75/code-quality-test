import java.util.*;

public class Generated_636766fe1a6d9265ec017838 {
    public static char[] toPrimitive(final Character[] array){
        if(array==null||array.length==0) return ArrayUtils.EMPTY_CHAR_ARRAY;
        final int len=array.length;
        final char[] result=new char[len];
        for(int i=0;i<len;i++){
            result[i]=array[i].charValue();
        }
        return result;
    }
}