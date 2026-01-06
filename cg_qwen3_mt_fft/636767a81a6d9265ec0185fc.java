import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        //read tag type
        int tagType = in.readUnsignedByte();
        //read tag length
        int tagLen = in.readInt();
        return tagType;
    }
}