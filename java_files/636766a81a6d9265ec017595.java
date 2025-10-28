import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
        final int size = this.data.size();
        if(size < 2) {
            this.data.ensureCapacity(2);
        }
        this.data.putByte(byteValue1);
        this.data.putByte(byteValue2);
        return this;
    }
}