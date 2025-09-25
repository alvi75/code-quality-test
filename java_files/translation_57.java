import java.util.*;

public class Translation57 {
    public int lastIndexOf(String str) {
    int index = -1;
    for (int i = _length - 1;
    i >= 0;
    i--) {
        if (_buffer[i] == str[0]) {
            index = i;
            break;
        }
    }
    return index;
}
}