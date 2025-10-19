import java.util.*;

public class Generated_6367676b1a6d9265ec0181e2 {
    public static Object findFirstMatch(Collection source,Collection candidates){
		Iterator it = candidates.iterator();
		while(it.hasNext()){
			Object o = it.next();
			if(source.contains(o)){
				return o;
			}
		}
		return null;
	}
}