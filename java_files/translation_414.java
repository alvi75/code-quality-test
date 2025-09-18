public int lastIndexOf(Object object) {
    int pos = size;
    Link<E> link = voidLink.previous;
    if (object != null) {
        while (link != voidLink) {
            pos--;
            if (object.equals(link.data)) {
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