import java.util.*;

public class Generated_636766f71a6d9265ec017730 {
    static String[] toNoNullStringArray(Collection<?> collection){
		if (collection == null) {
			return EMPTY_STRING_ARRAY;
		}
		String[] result = new String[collection.size()];
		int i = 0;
		for (Object o : collection) {
			result[i++] = o.toString();
		}
		return result;
	}
}