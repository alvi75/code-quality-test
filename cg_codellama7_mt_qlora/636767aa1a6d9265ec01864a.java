import java.util.*;

public class Generated_636767aa1a6d9265ec01864a {
    public byte[] toByteArray() {
        byte[] result = new byte[size];
        int pos = 0;
        for (int i = 0; i < segments.length; i++) {
            byte[] segment = segments[i];
            int segmentSize = segment.length;
            System.arraycopy(segment, 0, result, pos, segmentSize);
            pos += segmentSize;
        }
        return result;
    }
}