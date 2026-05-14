import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
        if(array==null||array.length==0)throw new IllegalArgumentException("The array can't be empty");
        List<String> list=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            Object o=array[i];
            if(o!=null){
                list.add(String.valueOf(o));
            }
        }
        return list.toArray(new String[list.size()]);
    }
}