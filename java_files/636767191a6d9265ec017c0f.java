import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size){
        if(size > this.size){
            final byte[] newBytes = new byte[size];
            System.arraycopy(this.bytes, 0, newBytes, 0, this.size);
            this.bytes = newBytes;
            this.size = size;
        }
    }
}