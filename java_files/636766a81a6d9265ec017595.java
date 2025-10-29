import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    public final ByteVector put11(final int byteValue1,final int byteValue2) {
        if (byteValue1 < 0 || byteValue1 > 255) throw new IllegalArgumentException("byteValue1 must be in [0,255] but is " + byteValue1);
        if (byteValue2 < 0 || byteValue2 > 255) throw new IllegalArgumentException("byteValue2 must be in [0,255] but is " + byteValue2);
        if (this.size == this.capacity) enlarge();
        this.data[this.size++] = (byte)byteValue1;
        this.data[this.size++] = (byte)byteValue2;
        return this;
    }
}