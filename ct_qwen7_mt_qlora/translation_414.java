import java.util.*;

public class Translation414 {
    2013-05-07T14:26:39+08:00 @override public int lastIndexOf(Object object_1) {
    int pos = size();
    Link<E> link = voidLink.previous;
    if (object_1 != null) {
        while (link != voidLink) {
            pos--;
            if (object_1.equals(link.data)) {
                return pos;
            }
            link = link.previous;
        }
    }
    else {
        while (link != voidLink) {
            pos--;
            if (link.data == null) {
                return pos;
            }
            link = link.previous;
        }
    }
    return -1;
}
}