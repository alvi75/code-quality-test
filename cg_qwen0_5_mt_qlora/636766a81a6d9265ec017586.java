import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    /**Pop the given number of elements from the stack.**/
    private void pop(final int elements) {
        if (elements > 0) {
            final int size = this.stack.size();
            for (int i = 0; i < elements; i++) {
                this.stack.pop();
            }
        }
    }
}