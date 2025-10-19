import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    public final byte[] toByteArray(){
        int len = (int)capacity;
        if(len>buffer.length)
            throw new IllegalArgumentException("Can't copy more than " + capacity + " bytes");
        byte[] b = new byte[len];
        buffer.get(b);
        return b;
    }
}