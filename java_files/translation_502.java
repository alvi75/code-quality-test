ublic Iterator<E> iterator() {
    Object[] snapshot = elements;
    return new CowIterator<E>(snapshot, 0, snapshot.length);
}