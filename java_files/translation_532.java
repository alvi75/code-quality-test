public E get(int location) {
    try {
        return a[location];
    }
    catch (IndexOutOfBoundsException e) {
        throw new ArrayIndexOutOfBoundsException(location, a.length);
    }
}