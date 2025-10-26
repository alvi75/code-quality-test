import java.util.*;

public class Translation869 {
    public final void write(final int oneByte) {
    if (oneByte < 0 || oneByte > 255) {
        throw new IllegalArgumentException("byte value out of range");
    }
    else if (pos == buf.length) {
        grow(1);
    }
    buf[pos++] = (byte) oneByte;
}
}