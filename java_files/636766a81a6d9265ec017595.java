import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,
                           final int byteValue2) {
        if (this._size + 2 > this._limit) {
            enlarge(2);
        }
        this._data[this._size++] = (byte) byteValue1;
        this._data[this._size++] = (byte) byteValue2;
        return this;
    }
}