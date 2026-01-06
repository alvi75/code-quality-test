import java.util.*;

public class Translation965 {
    public final void set(final int index, final long n) {
    if (count < index) {
        throw new IndexOutOfBoundsException(Integer.toString(index));
    }
    else if (count == index) {
        add(n);
    }
    else {
        entries[index] = n;
    }
}
}