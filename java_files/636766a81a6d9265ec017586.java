import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    /**
     * Pop the given number of elements from the stack.
     */
    private void pop(final int elements) {
        if (elements > 0 && elements <= this.stack.size()) {
            for (int i = 0; i < elements; i++) {
                this.stack.pop();
            }
        } else {
            throw new IllegalArgumentException("The number of elements to be popped must be between 1 and " + this.stack.size());
        }
    }
}