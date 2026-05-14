import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2) {
        if (position + 2 > limit) {
            grow(position + 2);
        }
        put(byteValue1);
        put(byteValue2);
        return this;
    }
}