import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
        final int len = this.size;
        if(len+2>this.maxSize)ensureCapacity(len+2);
        this.data[this.size++]=(byte)(byteValue1&0xff);
        this.data[this.size++]=(byte)(byteValue2&0xff);
        return this;
    }
}