import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    public final ByteVector put11(final int byteValue1,final int byteValue2){
        //assert this.count + 2 <= this.buffer.length;
        if (this.count + 2 > this.buffer.length) {
            this.ensureBufferSpace(2);
        }
        this.buffer[this.count++] = (byte)byteValue1;
        this.buffer[this.count++] = (byte)byteValue2;
        return this;
    }
}