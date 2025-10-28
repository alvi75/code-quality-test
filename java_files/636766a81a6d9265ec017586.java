import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    private void pop(final int elements) {
        if (elements > size()) {
            throw new IllegalArgumentException("Cannot pop more than " + size() + " elements");
        }
        for (int i = 0; i < elements; ++i) {
            stack.pop();
        }
    }
}