ublic E get(int location) {
    try {
        return a[location];
    }
    catch (IndexOutOfBoundsException e) {
        throw new RuntimeException(e);
    }
}