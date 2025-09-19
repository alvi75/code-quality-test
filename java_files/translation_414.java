import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    int pos = size();
    Object[] array = new Object[pos--];
    System.arraycopy(linkedList.toArray(array), 0, array, 0, pos);
    linkedList = array;
    return pos;
}
}