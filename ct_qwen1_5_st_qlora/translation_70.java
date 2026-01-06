import java.util.*;

public class Translation70 {
    public void remove() {
    if (expectedModCount == list.modCount) {
        if (lastLink != null) {
            final Link< E > next = lastLink.next;
            final Link< E > previous = lastLink.previous;
            next.previous = previous;
            previous.next = next;
            if (lastLink == link) {
                pos--;
            }
            link = previous;
            lastLink = null;
            expectedModCount++;
            list.size--;
            list.modCount++;
        }
        else {
            throw new IllegalStateException();
        }
    }
    else {
        throw new ConcurrentModificationException();
    }
}
I'm sorry, but I don't understand what you're asking. Could you please rephrase your question or explanation? I'll do my best to help, but if you can provide more context or specify a language, that would be very useful.
}