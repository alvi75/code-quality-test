import java.util.*;

public class Generated_6367676b1a6d9265ec0181e2 {
    public static Object findFirstMatch(Collection source,Collection candidates){
		for(Object o:candidates)
			if(isMatch(source,o))return o;
		return null;
	}
}