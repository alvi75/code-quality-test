import java.util.*;

public class Generated_6367676b1a6d9265ec0181e2 {
    public static Object findFirstMatch(Collection source,Collection candidates){
		Iterator it = candidates.iterator();
		while(it.hasNext()){
			Object candidate = it.next();
			if(source.contains(candidate)){
				return candidate;
			}
		}
		return null;
	}
}