import java.util.*;

public class Generated_636767aa1a6d9265ec01864a {
    /**Copy bytes to a byte array.**/
    public byte[] toByteArray(){
        int size = getByteSize();
        if(size == 0) return new byte[0];
        byte[] result = new byte[size];
        System.arraycopy(_buf, _offset, result, 0, size);
        return result;
    }
}