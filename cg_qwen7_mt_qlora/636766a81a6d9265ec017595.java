import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    /**Put two bytes into a byte vector called data.The vector will be enlarged if necessary.And return the ByteVector object.*/
final ByteVector put11(final int byteValue1,final int byteValue2){
        final int len = data.length;
        if(len - pos < 2){
            enlarge(2);
        }
        data[pos++] = (byte)byteValue1;
        data[pos++] = (byte)byteValue2;
        return this;
    }
}