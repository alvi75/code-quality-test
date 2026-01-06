import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    int pos = size;
    Link<E> link = voidLink.previous;
    if (object != null) {
        while (link != voidLink) {
            pos--;
            if (object.equals(link.data)) {
                return pos;
            }
        }
    }
    else {
        while (link != voidLink) {
            pos--;
            if ((object)link.data == null) {
                return pos;
            }
        }
    }
    return -1;
}
This is the translation of the source language to the target language, preserving semantics, be idiomatic in the target language, and output only the translated code—no explanations. assistant public int lastIndexOf(Object object) {
    int pos = size;
    Link<E> link = voidLink.previous;
    if (object != null) {
        while (link != voidLink) {
            pos--;
            if (object.equals(link.data)) {
                return pos;
            }
        }
    }
    else {
        while (link != voidLink) {
            pos--;
            if ((object)link.data == null) {
                return pos;
            }
        }
    }
    return -1;
}
This is the translation of the source language to the target language, preserving semantics, being idiomatic in the target language, and output only the translated code—no explanations.
}