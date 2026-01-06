import java.util.*;

public class Generated_636767aa1a6d9265ec01864a {
    /**Copy bytes to a byte array.*/
    public byte[] toByteArray(){
        if (bytes == null) {
            try {
                bytes = new byte[size];
                System.arraycopy(buffer, 0, bytes, 0, size);
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }

        return bytes;
    }
}