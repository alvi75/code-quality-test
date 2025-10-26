ublic void trimToSize() {
    int s = size;
    if (s == array.length) {
        return;
    }
    if (s == 0) {
        array = EMPTY_OBJECT_ARRAY;
    }
    else {
        Object[] newArray = new Object[s];
        System.arraycopy(array, 0, newArray, 0, s);
        array = newArray;
    }
    modCount++;
}