import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    public void pop(int elements) {
        if (elements < 0) {
            throw new IllegalArgumentException("elements must be >= 0");
        }
        if (elements > size) {
            throw new IllegalArgumentException("elements must be <= size");
        }
        size -= elements;
    }
}