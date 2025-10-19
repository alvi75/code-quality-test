import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    public static String[] toNoNullStringArray(Object[] array){
        if(array==null||array.length==0)
            throw new IllegalArgumentException("The length of the array must be greater than 0");
        for (Object o : array) {
            if(o==null)
                throw new IllegalArgumentException("The element in the array can't be null");
        }
        return Arrays.stream(array).map(String::valueOf).toArray(String[]::new);
    }
}