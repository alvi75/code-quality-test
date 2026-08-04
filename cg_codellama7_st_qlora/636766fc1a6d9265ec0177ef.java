import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
        if(array==null)throw new NullPointerException();
        int size=0;
        for(Object obj:array){
            if(obj!=null)size++;
        }
        String[] result=new String[size];
        int index=0;
        for(Object obj:array){
            if(obj!=null)result[index++]=obj.toString();
        }
        return result;
    }
}