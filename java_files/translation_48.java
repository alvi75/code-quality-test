import java.util.*;

public class Translation48 {
    public E previous() {
    if (iterator.previousIndex() >= start) {
        return iterator.previous();
    }
    else {
        throw new NoSuchElementException();
    }
}
}