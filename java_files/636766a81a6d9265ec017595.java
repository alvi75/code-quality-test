import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
        final int newLength = this.length + 2;
        if(newLength > this.data.length){
            final byte[] newData = new byte[newLength];
            System.arraycopy(this.data,0,newData,0,this.length);
            this.data = newData;
        }
        this.data[this.length++] = (byte)byteValue1;
        this.data[this.length++] = (byte)byteValue2;
        return this;
    }
}