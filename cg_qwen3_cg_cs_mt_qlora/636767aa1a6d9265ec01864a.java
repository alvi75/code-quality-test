import java.util.*;

public class Generated_636767aa1a6d9265ec01864a {
    public byte[] toByteArray(){
        if (this.length == 0) {
            return new byte[0];
        }
        byte[] result = new byte[this.length];
        System.arraycopy(this.data, this.offset, result, 0, this.length);
        return result;
    }
}