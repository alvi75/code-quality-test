import java.util.*;

public class Generated_636766f01a6d9265ec017639 {
    public static <T>List<T> asList(T[] a){
        if(a==null) return Collections.emptyList();
        List<T> l = new ArrayList<>(a.length);
        for(int i=0; i<a.length; i++) l.add(a[i]);
        return l;
    }
}