ublic E previous() throws NoSuchElementException {
    if (iterator.previousIndex() >= start) {
        return iterator.previous();
    }
    throw new NoSuchElementException();
}