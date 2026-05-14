import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    private void pop(final int elements) {
        if (elements > 0) {
            for (int i = 0; i < elements; i++) {
                final Object o = stack.pop();
                if (o instanceof Closeable) {
                    try {
                        ((Closeable) o).close();
                    } catch (final IOException e) {
                        // ignore
                    }
                }
            }
        }
    }
}