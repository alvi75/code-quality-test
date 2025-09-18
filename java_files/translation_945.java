public E pollFirst() {
    return (size == 0) ? null : removeFirstImpl();
}