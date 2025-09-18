public E previous() {
    if (iterator.previousIndex() >= start) {
        return iterator.previous();
    }
    throw new NoSuchElementException();
}