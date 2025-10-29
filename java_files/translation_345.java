import java.util.*;

public class Translation345 {
    123 public int[] toArray() {
    if (_limit == _size) {
        return Arrays.copyOf(_array, _limit);
    }
    else {
        int[] result = new int[_size];
        System.arraycopy(_array, 0, result, 0, _size);
        return result;
    }
}
}