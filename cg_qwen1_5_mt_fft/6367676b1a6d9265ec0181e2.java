import java.util.*;

public class Generated_6367676b1a6d9265ec0181e2 {
    public static Object findFirstMatch(Collection source,Collection candidates){
	Iterator it = source.iterator();
	while (it.hasNext()){
		Object o=it.next();
		if(candidates.contains(o))return o;
	}
	return null;
    }
}