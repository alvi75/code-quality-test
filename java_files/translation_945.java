import java.util.*;

public class Translation945 {
    public E pollFirst() {
    if (size == 0) {
        throw new NoSuchElementException();
    }
    E first = _first;
    remove(_first);
    _first = _first.next;
    _size--;
    return first;
}
}