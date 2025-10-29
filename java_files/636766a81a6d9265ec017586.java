import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    /**Pop the given number of elements from the stack.**/
    private void pop(final int elements) {
        if (elements > size - index) {
            throw new IllegalStateException("Not enough elements in stack");
        }
        for (int i = 0; i < elements; i++) {
            data[index + i] = null;
        }
        index += elements;
    }
}