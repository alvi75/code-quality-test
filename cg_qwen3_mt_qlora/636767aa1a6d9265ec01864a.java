import java.util.*;

public class Generated_636767aa1a6d9265ec01864a {
    /**Copy bytes to a byte array.*/
public byte[] toByteArray(){
        if (this.bytes == null) {
            return new byte[0];
        }
        else {
            return Arrays.copyOf(this.bytes, this.bytes.length);
        }
    }
}