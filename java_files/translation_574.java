import java.util.*;

public class Translation574 {
    ublic boolean[] copyOf(boolean[] original, int newLength) {
    if (newLength < 0) {
        throw new NegativeArraySizeException();
    }
    return copyOfRange(original, 0, newLength);
}
}