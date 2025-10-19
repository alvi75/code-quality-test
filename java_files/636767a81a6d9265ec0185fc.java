import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        //int i = 0;
        byte[] bytes = new byte[1];
        int b = in.read(bytes);
        if (b == -1) return 0;
        else {
            //i = ((int)bytes[0] & TAG_TYPE_MASK) >> TAG_TYPE_SHIFT;
            //if(i==0) return 0;
            //else return i;
            return (int)bytes[0] & TAG_TYPE_MASK;
        }
    }
}