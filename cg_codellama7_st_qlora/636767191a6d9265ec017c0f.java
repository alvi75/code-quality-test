import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size){
        final byte[] newData = new byte[data.length + size];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}