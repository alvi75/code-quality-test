import java.util.*;

public class Translation965 {
    public void set(int index, long n) {
    if (count < index) {
        throw new IndexOutOfBoundsException();
    }
    else if (count == index) {
        add(n);
    }
    else {
        entries[index] = n;
    }
}
}