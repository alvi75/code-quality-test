import java.util.*;

public class Translation574 {
    1 public static boolean[] copyOf(boolean[] original, int newLength) {
    2 if (newLength < 0)3 throw new NegativeArraySizeException();
    4 return copyOfRange(original, 0, newLength);
}
}