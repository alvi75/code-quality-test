import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
        final int length = this.data.length;
        if(length < 2) {
            this.enlarge(2);
        }
        this.data[length] = (byte) byteValue1;
        this.data[length + 1] = (byte) byteValue2;
        return this;
    }
}