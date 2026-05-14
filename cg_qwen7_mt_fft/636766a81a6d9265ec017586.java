import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    private void pop(final int elements) {
        if (elements == 0)
            return;
        final int newTop = top - elements;

        // we know that newTop >= 0, so only need to check upper bound
        assert(newTop < values.length);
        top = newTop;
    }
}