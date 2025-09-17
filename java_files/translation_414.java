import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_414 {
    public int lastIndexOf(Object object) {
        int pos = size();
        Object[] array = new Object[pos--];
        System.arraycopy(linkedList.toArray(array), 0, array, 0, pos);
        linkedList = new LinkedList(array);
        return pos;
    }
}