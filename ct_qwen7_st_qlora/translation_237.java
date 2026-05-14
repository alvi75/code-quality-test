import java.util.*;

public class Translation237 {
    public long ramBytesUsed() {
    return super.ramBytesUsed()+ByteBlockPool.sizeOf(blocks)+intValues.bytes().length;
}
}