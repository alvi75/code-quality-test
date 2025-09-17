import java.util.*;

public class Translationtranslation_414 {
    public int lastIndexOf(Object object) {
        int pos = size;
        Link<E> link = voidLink.previous;
        if (object != null) {
            while (link != voidLink) {
                if (object.equals(link.data)) {
                    return pos;
                }
                link = link.previous;
                pos--;
            }
            while (link != voidLink) {
                if (object.equals(link.data)) {
                    return pos;
                }
                link = link.previous;
                pos--;
            }
        }
    }
    else {
        while (link != voidLink) {
            if (link.data == null) {
                return pos;
            }
            link = link.previous;
            pos--;
        }
        while (link != voidLink) {
            if (link.data == null) {
                return pos;
            }
            link = link.previous;
            pos--;
        }
    }
    }
    return -1;
    }
}