import java.util.*;

public class Generated_6367676c1a6d9265ec018223 {
    public static boolean containsInstance(Collection collection,Object element){
		if(collection==null) return false;
		for(Iterator it=collection.iterator();it.hasNext();){
			if(it.next()==element) return true;
		}
		return false;
	}
}