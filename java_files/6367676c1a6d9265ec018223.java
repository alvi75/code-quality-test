import java.util.*;

public class Generated_6367676c1a6d9265ec018223 {
    /**Check whether the element exists in the collection.**/
    public static boolean containsInstance(Collection collection, Object element){
        for (Object o : collection) {
            if (o.equals(element)) return true;
        }
        return false;
    }
}