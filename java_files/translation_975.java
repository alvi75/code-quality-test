ublic void add(E object) {
    Iterator<E> iterator = iterator;
    while (true) {
        E next = iterator.next();
        if (next == null) {
            break;
        }
        else if (object.equals(next)) {
            return;
        }
        else if (object.compareTo(next) < 0) {
            throw new IllegalArgumentException("Object is not less than " + next);
        }
        else {
            iterator.remove();
        }
    }
    addInternal(object);
}