import java.util.*;

public class Translation409 {
    0;
int length = value.length;
if (index < 0 || index >= length) {
    throw new IndexOutOfBoundsException("Index " + index + " out of range [0.." + (length - 1) + "]");
}
return Character.codePointAt(value, index);
}
}