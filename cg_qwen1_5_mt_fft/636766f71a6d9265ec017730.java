import java.util.*;

public class Generated_636766f71a6d9265ec017730 {
    static String[] toNoNullStringArray(Collection<?> collection){
		if(collection == null || collection.isEmpty()){
			return EMPTY_STRING_ARRAY;
		}else{
			List<String> stringList = new ArrayList<>();
			for(Object o : collection){
				String str = (String)o;
				stringList.add(str);
			}
			return stringList.toArray(new String[stringList.size()]);
		}
	}
}