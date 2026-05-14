import java.util.*;

public class Translation965 {
    1 public void set(final int index, final long n) {
    2 if (count < index) {
        3 throw new IndexOutOfBoundsException();
        4 }
        else {
            5 if (count == index) {
                6 add(n);
                7 }
                else {
                    8 entries[index] = n;
                    9 }
                    10 }
                }
}