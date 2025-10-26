ublic boolean equals(Object o) {
    if (this == o) {
        return true;
    }
    if (!(o instanceof Set)) {
        return false;
    }
    Set<?> other = (Set<?>) o;
    return size() == other.size() && containsAll(other);
}