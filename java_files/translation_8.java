import java.util.*;

public class Translation8 {
    public void init(int address) {
    slice = pool.buffers[address >> ByteBlockPool.BYTE_BLOCK_SHIFT];
    Debug.check(slice != null);
    upto = address & ByteBlockPool.BYTE_BLOCK_MASK;
    offset0 = address;
    Debug.assert(upto < slice.length);
}
}