import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
        final int size = _size + 2;
        if(size > _data.length) {
            resize(size);
        }
        _data[_size++] = (byte)(byteValue1 >> 8);
        _data[_size++] = (byte)byteValue2;
        return this;
    }
}