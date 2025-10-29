import java.util.*;

public class Translation521 {
    0;
i <= location;
i++) {
    link = link.next;
}
else {
    for (int i = _size;
    i > location;
    i--) {
        link = link.previous;
    }
}
java.util.LinkedList.Link<E> previous = link.previous;
java.util.LinkedList.Link<E> newLink = new java.util.LinkedList.Link<E>(object, previous, link);
previous.next = newLink;
link.previous = newLink;
_size++;
modCount++;
}
}
}