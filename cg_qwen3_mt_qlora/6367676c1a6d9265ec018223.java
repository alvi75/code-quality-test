import java.util.*;

public class Generated_6367676c1a6d9265ec018223 {
    /**Check whether the element exists in the collection.**/
    public static boolean containsInstance(Collection collection,Object element){
        if(collection==null)return false;
        for (Iterator it = collection.iterator(); it.hasNext();) {
            Object o = it.next();
            if(o==element)return true;
        }
        return false;
    }
}