import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    /**Enlarge the byte vector data, by increasing it by the given size.*/
    private void enlarge(final int size){
        final byte[] newData = new byte[data.length + size];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}