ublic Record getNext() throws IOException {
    if (_nextIndex >= _list.size()) {
        throw new NoSuchElementException();
    }
    return (Record)_list.get(_nextIndex++);
}