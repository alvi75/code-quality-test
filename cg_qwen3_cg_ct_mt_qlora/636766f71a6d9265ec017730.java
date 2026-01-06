import java.util.*;

public class Generated_636766f71a6d9265ec017730 {
    static String[] toNoNullStringArray(Collection<?> collection){
        if (collection == null) {
            return EMPTY_STRING_ARRAY;
        }
        else {
            List<String> list = new ArrayList<String>();
            for (Object o : collection) {
                if (o != null) {
                    list.add(o.toString());
                }
            }
            return list.toArray(new String[list.size()]);
        }
    }
}