import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset){
        final byte[] bytes = new byte[8];
        for(int i=0; i<8; i++){
            bytes[i] = this.data[offset+i];
        }
        return ByteBuffer.wrap(bytes).getLong();
    }
}