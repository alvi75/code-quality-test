import java.util.*;

public class Generated_6367676c1a6d9265ec018223 {
    public static boolean containsInstance(Collection collection,Object element){
		if(collection==null || element==null)
			return false;
		
		Iterator it = collection.iterator();
		while(it.hasNext()){
			Object candidate = it.next();
			if(candidate!=null && element.equals(candidate))
				return true;
		}
		
		return false;
	}
}