import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    /**Enlarge the byte vector data, by increasing it by the given size.**/
    private void enlarge(final int size){
        if (size > 0) {
            final byte[] newData = new byte[byteVector.length + size];
            System.arraycopy(byteVector, 0, newData, 0, byteVector.length);
            byteVector = newData;
        }
    }
}